package t1068;

import java.io.PrintStream;
import java.util.Scanner;

public class T1068 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int N = inFile.nextInt();
			int sum;
			if (N > 1) {
				sum = N*(N+1)/2;
			} else if (N == 0 || N == 1) {
				sum = 1;
			} else if (N == -1) {
				sum = 0;
			} else {
				N = -N;
				sum = N*(N+1)/2 - 1;
				sum = -sum;
			}
			
			outFile.println(sum);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
