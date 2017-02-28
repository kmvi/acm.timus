
import java.io.PrintStream;
import java.util.Scanner;

public class T1390 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			int[][] m = new int[n][n];
			
			int total = 2*n-1;
			int cnt = 1;
			for (int i = 0; i < total; ++i) {
				int x = n-i-1;
				int y = 0;
				if (i >= n) {
					x = 0;
					y = i-n+1;
				}
				
				while (x != n && y != n) {
					m[y++][x++] = cnt++;
				}
			}
			
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					outFile.print(m[i][j]);
					if (j != n-1) outFile.print(' ');
				}
				if (i != n-1) outFile.println();
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
