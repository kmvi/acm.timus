// http://acm.timus.ru/problem.aspx?space=1&num=1935


import java.io.PrintStream;
import java.util.Scanner;

public class T1935 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			
			int m = 0, sm = 0;
			for (int i = 0; i < n; ++i) {
				int k = inFile.nextInt();
				sm += k;
				if (k > m)
					m = k;
			}
			
			outFile.println(sm+m);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
