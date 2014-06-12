// http://acm.timus.ru/problem.aspx?space=1&num=1639

package t1639;

import java.io.PrintStream;
import java.util.Scanner;

public class T1639 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int m = inFile.nextInt();
			int n = inFile.nextInt();
			
			Boolean f;
			f = ((m-1) % 2 == 0);
			
			if (f && ((n-1) * m) % 2 == 0)
				outFile.println("[second]=:]");
			else if (f && ((n-1) * m) % 2 == 1)
				outFile.println("[:=[first]");
			else if (!f && ((n-1) * m) % 2 == 0)
				outFile.println("[:=[first]");
			else
				outFile.println("[second]=:]");
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
