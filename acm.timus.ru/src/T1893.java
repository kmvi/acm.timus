// http://acm.timus.ru/problem.aspx?space=1&num=1893

package t1893;

import java.io.PrintStream;
import java.util.Scanner;

public class T1893 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			String ln = inFile.nextLine();
			char ch = ln.charAt(ln.length()-1);
			int row = Integer.parseInt(ln.substring(0, ln.length()-1));
			
			String ans;
			if (row <= 2) {
				if (ch == 'A' || ch == 'D')
					ans = "window";
				else if (ch == 'B' || ch == 'C')
					ans = "aisle";
				else
					ans = "neither";
			} else if (row <= 20) {
				if (ch == 'A' || ch == 'F')
					ans = "window";
				else
					ans = "aisle";
			} else {
				if (ch == 'A' || ch == 'K')
					ans = "window";
				else if (ch == 'C' || ch == 'D' || ch == 'G' || ch == 'H')
					ans = "aisle";
				else
					ans = "neither";
			}
			
			outFile.println(ans);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
