package t2011;

import java.io.PrintStream;
import java.util.Scanner;

public class T2011 {
	
	public static int[] getSeq(int n)
	{
		int[] ns = new int[n];
		for (int i = 1; i <= n; ++i)
			ns[i-1] = i;
		
		return ns;
	}
	
	public static void reduce(int[] n, int[] a)
	{
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < n.length; ++j) {
				if (n[j] % a[i] == 0) {
					n[j] /= a[i];
					a[i] = 1;
					break;
				}
			}
		}
	}
	
	public static long prod(int[] n)
	{
		long result = 1;
		for (int i = 0; i < n.length; ++i)
			result *= n[i];
		
		return result;
	}

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			int a = 0, b = 0, c = 0;
			
			for (int i = 0; i < n; ++i) {
				int k = inFile.nextInt();
				if (k == 1) a++;
				else if (k == 2) b++;
				else c++;
			}
			
			int[] ns = getSeq(n);
			int[] as = getSeq(a);
			int[] bs = getSeq(b);
			int[] cs = getSeq(c);
			
			reduce(ns, as);
			reduce(ns, bs);
			reduce(ns, cs);
			
			long result = prod(ns) / prod(as) / prod(bs) / prod(cs);
			
			outFile.println(result >= 6 ? "Yes" : "No");
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
