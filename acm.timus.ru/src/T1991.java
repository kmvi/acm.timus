// http://acm.timus.ru/problem.aspx?space=1&num=1910

package t1991;

import java.io.PrintStream;
import java.util.Scanner;

public class T1991 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int blockCount = inFile.nextInt();
			int dCount = inFile.nextInt();
			
			long dSum = 0, bSum = 0;
			
			for (int i = 0; i < blockCount; ++i) {
				int b = inFile.nextInt();
				int d = dCount;
				if (b >= dCount) {
					b -= dCount;
					d = 0;
				} else {
					d -= b;
					b = 0;					
				}
				dSum += d;
				bSum += b;
			}
			
			outFile.println(String.format("%d %d", bSum, dSum));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
