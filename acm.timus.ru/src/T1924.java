// http://acm.timus.ru/problem.aspx?space=1&num=1924

// не важно, какой знак ставить, поэтому все сводится к определению
// четности или нечетности суммы 1..n


import java.io.PrintStream;
import java.util.Scanner;

public class T1924 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			int k = n*(n+1)/2;
			
			if (k % 2 == 0) {
				outFile.println("black");
			} else {
				outFile.println("grimy");
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
