package t1026;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T1026 {

	public static void main(String[] args) {
		try {
			StreamTokenizer inFile = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			inFile.nextToken();
			int n = (int)inFile.nval;
			
			short[] values = new short[n];
			for (int i = 0; i < n; ++i) {
				inFile.nextToken();
				values[i] = (short)inFile.nval;
			}
			
			inFile.nextToken();
			inFile.nextToken();
			inFile.nextToken();
			
			Arrays.sort(values);

			inFile.nextToken();
			int k = (int)inFile.nval;
			
			for (int i = 0; i < k; ++i) {
				inFile.nextToken();
				int query = (int)inFile.nval - 1;
				outFile.println(values[query]);
			}
						
			outFile.flush();
		} catch (Exception e) {}
	}

}