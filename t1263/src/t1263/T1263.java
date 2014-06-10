// http://acm.timus.ru/problem.aspx?space=1&num=1263

package t1263;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Locale;

public class T1263 {

	public static void main(String[] args) throws IOException {
		try {
			StreamTokenizer inFile = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			inFile.nextToken();
			int cCount = (int)inFile.nval;
			
			inFile.nextToken();
			int eCount = (int)inFile.nval;
			
			int[] counter = new int[cCount];
			
			for (int i = 0; i < eCount; ++i) {
				inFile.nextToken();
				int v = (int)inFile.nval;
				counter[v-1]++;
			}
			
			for (int i = 0; i < cCount; ++i) {
				outFile.println(String.format(new Locale("en-US"), "%.2f%%", 100.0 * ((double)counter[i] / eCount)));
			}
	
			outFile.flush();
		} catch (Exception e) {}
	}

}