// http://acm.timus.ru/problem.aspx?space=1&num=1502

package t1502;

import java.io.PrintStream;
import java.util.Scanner;

public class T1502 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int N = inFile.nextInt();
			
			long sum = 0;
			for (int k = 0; k <= N; ++k) {
				sum += (3*k+N) * (N-k+1) / 2;
			}
			
			outFile.println(sum);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
