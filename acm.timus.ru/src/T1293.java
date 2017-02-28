// http://acm.timus.ru/problem.aspx?space=1&num=1293


import java.io.PrintStream;
import java.util.Scanner;

public class T1293 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int N = inFile.nextInt();
			int A = inFile.nextInt();
			int B = inFile.nextInt();
			
			outFile.println(2*N*A*B);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
