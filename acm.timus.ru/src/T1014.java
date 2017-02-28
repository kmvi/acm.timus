// http://acm.timus.ru/problem.aspx?space=1&num=1014

package t1014;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class T1014 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			long N = inFile.nextLong();
			byte[] nums = new byte[30];
			
			if (N == 0) {
				outFile.println("10");
			} else if (N == 1) {
				outFile.println("1");
			} else {			
				long k = N;
				int i = 0;
				while (k > 1) {
					Boolean f = false;
					
					for (int j = 9; j >= 2; --j) {
						if (k % j == 0) {
							f = true;
							nums[i++] = (byte)j;
							k /= j;
							break;
						}
					}
					
					if (!f) break;
				}
				
				if (k > 1) {
					outFile.println(-1);
				} else {
					Arrays.sort(nums);
					for (byte p: nums) {
						if (p > 0) {
							outFile.print(p);
						}
					}
					outFile.println();
				}
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
