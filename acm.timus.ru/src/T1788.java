
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class T1788 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int fCount = inFile.nextInt();
			int mCount = inFile.nextInt();
			
			int[] g = new int[fCount];
			int[] b = new int[mCount];
			
			for (int i = 0; i < fCount; ++i)
				g[i] = inFile.nextInt();
			
			for (int i = 0; i < mCount; ++i)
				b[i] = inFile.nextInt();
			
			Arrays.sort(g);
			Arrays.sort(b);
			
			int minSum = Integer.MAX_VALUE;

			for (int k = 0; k <= (fCount <= mCount ? fCount : mCount); ++k) {
				
				int sum = 0;				
				for (int i = 0; i < mCount-k; ++i)
					sum += b[i];
				
				sum *= k;
				
				for (int i = 0; i < fCount-k; ++i)
					sum += g[i];
				
				if (sum < minSum)
					minSum = sum;
			}
			
			outFile.println(minSum);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
