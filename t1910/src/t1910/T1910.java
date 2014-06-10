// http://acm.timus.ru/problem.aspx?space=1&num=1910

package t1910;

import java.io.PrintStream;
import java.util.Scanner;

public class T1910 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			int[] k = new int[n];
			
			for (int i = 0; i < n; ++i)
				k[i] = inFile.nextInt();
			
			int maxsum = 0;
			int maxind = 0;
			for (int i = n-3; i >= 0; --i) {
				int sum = k[i] + k[i+1] + k[i+2]; 
				if (sum > maxsum) {
					maxsum = sum;
					maxind = i+2;
				}
			}
			
			outFile.println(String.format("%d %d", maxsum, maxind));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
