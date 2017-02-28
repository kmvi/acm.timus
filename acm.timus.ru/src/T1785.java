// http://acm.timus.ru/problem.aspx?space=1&num=1785

package t1785;

import java.io.PrintStream;
import java.util.Scanner;

public class T1785 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int N = inFile.nextInt();
			String answer;
			
			if (N <= 4)
				answer = "few";
			else if (N <= 9)
				answer = "several";
			else if (N <= 19)
				answer = "pack";
			else if (N <= 49)
				answer = "lots";
			else if (N <= 99)
				answer = "horde";
			else if (N <= 249)
				answer = "throng";
			else if (N <= 499)
				answer = "swarm";
			else if (N <= 999)
				answer = "zounds";
			else
				answer = "legion";
			
			outFile.println(answer);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
