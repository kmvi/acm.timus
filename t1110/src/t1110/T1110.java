package t1110;

import java.io.PrintStream;
import java.util.Scanner;

public class T1110 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			long N = inFile.nextInt();
			long M = inFile.nextInt();
			long Y = inFile.nextInt();
			
			Boolean f = false;
			for (long i = 0; i < M; ++i) {
				if ((long)(Math.pow(i, N)) % M == Y) {
					f = true;
					outFile.print(i);
					outFile.print(" ");
				}
			}
			
			if (!f)
				outFile.print(-1);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
