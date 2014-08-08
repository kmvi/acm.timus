package t1139;

import java.io.PrintStream;
import java.util.Scanner;

public class T1139 {
	
	public static double k;
	
	public static boolean isBelow(double x, double y)
	{
		return k * x > y ? true : false;
	}

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int N = inFile.nextInt();
			int M = inFile.nextInt();
			
			k = (M - 1.0) / (N - 1.0);
			
			final double delta = 1e-6;
			int cnt = 0;
			
			for (int row = 0; row < M-1; ++row) {
				for (int col = 0; col < N-1; ++col) {
					double y1 = row + 1 - delta;
					double x1 = col + delta;
					
					double y2 = row + delta;
					double x2 = col + 1 - delta;
					
					boolean pos1 = isBelow(x1, y1);
					boolean pos2 = isBelow(x2, y2);
					
					if (pos1 ^ pos2) {
						cnt++;
					}
				}
			}
			
			outFile.println(cnt);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
