package t1642;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class T1642 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			int x = inFile.nextInt();
			
			int[] p = new int[n];
			
			for (int i = 0; i < n; ++i) {
				p[i] = inFile.nextInt();
			}
			
			Arrays.sort(p);
			
			int left = Integer.MIN_VALUE, right = Integer.MAX_VALUE;
			for (int i = 0; i < n; ++i) {
				if (p[i] >= 0 && right == Integer.MAX_VALUE)
					right = p[i];
				else if (p[i] < 0 /*&& left == Integer.MIN_VALUE*/)
					left = p[i];
			}
			
			if (left > Integer.MIN_VALUE && right < Integer.MAX_VALUE) {
				if (x < left || x > right) {
					outFile.println("Impossible");
				} else if (x < 0) {
					outFile.println(String.format("%d %d", right + right - x, -x));
				} else if (x > 0) {
					outFile.println(String.format("%d %d", x, left + left + x));
				} else {
					outFile.println("0 0");
				}
			} else {
				outFile.println(String.format("%d %d", x > 0 ? x : -x, x > 0 ? x : -x));
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
