package t1225;

import java.io.PrintStream;
import java.util.Scanner;

public class T1225 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			long m = 2;
			long n1 = 0, n2 = 2;
			
			while (n-- > 1) {
				m = n1 + n2;
				n1 = n2;
				n2 = m;
			}
			
			outFile.println(m);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
