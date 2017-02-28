package t2005;

import java.io.PrintStream;
import java.util.Scanner;

public class T2005 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int[][] lens = new int[5][5];
			for (int i = 0; i < 5; ++i) {
				for (int j = 0; j < 5; ++j) {
					lens[i][j] = inFile.nextInt();
				}
			}
			
			int[][] paths = new int[][] {
					{1, 2, 3, 4, 5},
					{1, 3, 2, 4, 5},
					{1, 3, 4, 2, 5},
					{1, 4, 3, 2, 5},
			};
			
			int minSum = Integer.MAX_VALUE, minPath = -1;
			for (int i = 0; i < paths.length; ++i) {
				int sum = 0;
				
				for (int j = 0; j < 4; ++j) {
					int src = paths[i][j];
					int dest = paths[i][j+1];
					sum += lens[src-1][dest-1];
				}
				
				if (sum < minSum) {
					minSum = sum;
					minPath = i;
				}
			}
			
			outFile.println(minSum);
			for (int i = 0; i < 5; ++i) {
				outFile.print(paths[minPath][i]);
				outFile.print(' ');
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
