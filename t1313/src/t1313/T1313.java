package t1313;

import java.io.PrintStream;
import java.util.Scanner;

public class T1313 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int N = inFile.nextInt();
			int[][] m = new int[N][N];
			
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					m[i][j] = inFile.nextInt();
				}
			}
			
			for (int i = 0; i < 2*N; ++i) {
				int y = i;
				int x = 0;
				if (i >= N) {
					y = N-1;
					x = i-N+1;
				}
				
				while (y != -1 && x != N) {
					outFile.print(m[y--][x++]);
					if (i != 2*N-1) outFile.print(' ');
				}
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
