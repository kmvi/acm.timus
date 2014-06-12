package t1349;

import java.io.PrintStream;
import java.util.Scanner;

public class T1349 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			
			if (n > 2) {
				outFile.println(-1);
			} else if (n == 2) {
				outFile.println("3 4 5");
			} else if (n == 1) {
				outFile.println("1 2 3");
			} else {
				outFile.println("-1");
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
