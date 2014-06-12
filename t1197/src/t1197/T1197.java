// http://acm.timus.ru/problem.aspx?space=1&num=1197

package t1197;

import java.io.PrintStream;
import java.util.Scanner;

public class T1197 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int[] h = new int[8];
			int[] v = new int[8];
			
			int n = inFile.nextInt();
			int[] ans = new int[n];
			for (int i = 0; i < n; ++i) {
				String ln = inFile.next();
				int ver = ln.charAt(0) - 0x61;
				int hor = ln.charAt(1) - 0x30 - 1;
				
				// вверх
				v[0] = ver+2; v[1] = ver+2;
				h[0] = hor-1; h[1] = hor+1;
				
				
				// вниз
				v[2] = ver-2; v[3] = ver-2;
				h[2] = hor-1; h[3] = hor+1;
				
				// влево
				v[4] = ver+1; v[5] = ver-1;
				h[4] = hor-2; h[5] = hor-2;
				
				// вправо
				v[6] = ver+1; v[7] = ver-1;
				h[6] = hor+2; h[7] = hor+2;
				
				for (int j = 0; j < 8; ++j) {
					if (v[j] <= 7 && v[j] >= 0 && h[j] <= 7 && h[j] >= 0)
						ans[i]++;
				}
			}
			
			for (int i = 0; i < n; ++i) {
				outFile.println(ans[i]);
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
