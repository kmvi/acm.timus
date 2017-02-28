// http://acm.timus.ru/problem.aspx?space=1&num=1787


import java.io.PrintStream;
import java.util.Scanner;

public class T1787 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int k = inFile.nextInt();
			int n = inFile.nextInt();
			
			int queue = 0;
			for (int i = 0; i < n; ++i) {
				int a = inFile.nextInt();
				queue += a;
				queue -= k;
				if (queue < 0)
					queue = 0;
			}
			
			outFile.println(queue);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
