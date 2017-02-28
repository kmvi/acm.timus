// http://acm.timus.ru/problem.aspx?space=1&num=1005

// камней всего 20, поэтому решается тупо полным перебором


import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;

public class T1005 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			int[] stones = new int[n];
			
			for (int i = 0; i < n; ++i) {
				stones[i] = inFile.nextInt();
			}
			
			Arrays.sort(stones);
			
			int result = Integer.MAX_VALUE;
			
			// k в двоичном представлении будет хранить + и -: 0 это +, 1 это -
			int k = (int)Math.pow(2, (double)n)-1;
			for (int i = 0; i <= k; ++i) {
				int curmin = 0;
				
				for (int j = 0; j < n; ++j) {
					curmin += ((((i >> j) & 1) == 0) ? stones[j] : -stones[j]);
				}
				
				int t = Math.abs(curmin);
				if (t < result)
					result = t;
			}
			
			outFile.println(result);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
