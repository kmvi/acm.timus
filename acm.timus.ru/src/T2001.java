// http://acm.timus.ru/problem.aspx?space=1&num=2001


import java.io.PrintStream;
import java.util.Scanner;

public class T2001 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int a1 = inFile.nextInt();
			int b1 = inFile.nextInt();
			int a2 = inFile.nextInt();
			int b2 = inFile.nextInt();
			int a3 = inFile.nextInt();
			int b3 = inFile.nextInt();
			
			outFile.println(String.format("%d %d", a1-a3, b1-b2));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
