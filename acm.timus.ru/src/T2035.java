package t2035;

import java.io.PrintStream;
import java.util.Scanner;

public class T2023 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int X = inFile.nextInt();
			int Y = inFile.nextInt();
			int C = inFile.nextInt();
			
			if (X + Y < C)
				outFile.println("Impossible");
			else if (C <= X && C <= Y)
				outFile.printf("0 %d\n", C);
			else if (C > Y && C <= X)
				outFile.printf("%d 0\n", C);
			else if (C > X && C <= Y)
				outFile.printf("0 %d\n", C);
			else
				outFile.printf("%d %d\n", X, C-X);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
