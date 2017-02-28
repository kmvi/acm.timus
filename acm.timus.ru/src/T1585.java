package t1585;

import java.io.PrintStream;
import java.util.Scanner;

public class T1585 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			
			int lp = 0, ep = 0, mp = 0;
			while (n-- > 0) {
				String ln = inFile.next();
				inFile.next();
				if (ln.compareTo("Emperor") == 0) {
					ep++;
				} else if (ln.compareTo("Little") == 0) {
					lp++;
				} else if (ln.compareTo("Macaroni") == 0) {
					mp++;
				}
			}
			
			int max = Math.max(Math.max(ep, lp), mp);
			if (max == ep)
				outFile.println("Emperor Penguin");
			else if (max == lp)
				outFile.println("Little Penguin");
			else if (max == mp)
				outFile.println("Macaroni Penguin");
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
