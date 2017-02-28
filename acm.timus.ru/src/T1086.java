
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1086 {
	
	public static long[] primes = new long[15001];
	public static int maxN = 2;
	
	public static boolean isPrime(long num)
	{
		long to = (long)Math.sqrt((double)num)+1;
		for (long i = 3; i <= to; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}
	
	public static void fillPrimes(int to)
	{
		int ind = maxN;
		while (ind <= to) {
			long start = primes[ind-1];
			start += 2;
			while (!isPrime(start))
				start += 2;
			primes[ind] = start;
			ind++;
		}
	}

	public static void main(String[] args) throws IOException {
		//try {
			StreamTokenizer inFile = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			inFile.nextToken();
			int k = (int)inFile.nval;
			
			long[] ans = new long[k];		
			
			primes[0] = 2;
			primes[1] = 3;
			
			for (int i = 0; i < k; ++i) {
				inFile.nextToken();
				int nextN = (int)inFile.nval;
				
				if (nextN > maxN) {
					fillPrimes(nextN);					
					maxN = nextN;
				}
				
				ans[i] = primes[nextN-1];
			}
			
			for (int i = 0; i < k; ++i)
				outFile.println(ans[i]);
						
			outFile.flush();
		//} catch (Exception e) {}
	}

}