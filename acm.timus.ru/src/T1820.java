// http://acm.timus.ru/problem.aspx?space=1&num=1820

package t1820;

import java.io.PrintStream;
import java.util.Scanner;

public class T1820 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			int k = inFile.nextInt();
			
			int t = 0;
			if (k >= n) {
				t = 2;
			} else {
				n *= 2;
				t = (int)Math.ceil((double)n / k);
			}
			
			outFile.println(t);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
