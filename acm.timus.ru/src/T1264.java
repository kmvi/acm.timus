// http://acm.timus.ru/problem.aspx?space=1&num=1264

package t1264;

import java.io.PrintStream;
import java.util.Scanner;

public class T1264 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int N = inFile.nextInt();
			int M = inFile.nextInt();
			
			outFile.println(N*(M+1));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
