// http://acm.timus.ru/problem.aspx?space=1&num=1409


import java.io.PrintStream;
import java.util.Scanner;

public class T1409 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int a = inFile.nextInt();
			int b = inFile.nextInt();
			
			outFile.println(String.format("%d %d", b-1, a-1));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
