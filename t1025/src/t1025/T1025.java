package t1025;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class T1025 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			int nGroups = n / 2 + 1;
			int[] ni = new int[n];
			
			for (int i = 0; i < n; ++i) {
				ni[i] = inFile.nextInt();
			}
			
			Arrays.sort(ni);
			
			int cnt = 0;
			for (int i = 0; i < nGroups; ++i) {
				cnt += ni[i] / 2 + 1;
			}
			
			outFile.println(cnt);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
