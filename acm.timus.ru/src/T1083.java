package t1083;

import java.io.PrintStream;
import java.util.Scanner;

public class T1083 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			int k = inFile.next().trim().length();
			
			int to = 0;
			if (n % k == 0) {
				to = k;
			} else {
				to = n % k;
			}
			
			long prod = 1;
			int next = n;
			while (next >= to) {
				prod *= next;
				next -= k;
			}
			
			outFile.println(prod);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
