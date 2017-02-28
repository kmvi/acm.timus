// http://acm.timus.ru/problem.aspx?space=1&num=1877


import java.io.PrintStream;
import java.util.Scanner;

public class T1877 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n1 = inFile.nextInt();
			int n2 = inFile.nextInt();
			
			if (n1 % 2 == 1 && n2 % 2 == 0)
				outFile.println("no");
			else
				outFile.println("yes");
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
