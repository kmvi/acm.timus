// http://acm.timus.ru/problem.aspx?space=1&num=1545

package t1545;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1545 {

	public static void main(String[] args) {
		try {
			StreamTokenizer inFile = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			inFile.nextToken();
			short N = (short)inFile.nval;
			String[] chrs = new String[N];
			
			for (short i = 0; i < N; ++i) {
				inFile.nextToken();
				chrs[i] = inFile.sval;
			}
			
			inFile.nextToken();
			char c = inFile.sval.charAt(0);
			
			for (short i = 0; i < N; ++i) {
				if (chrs[i].charAt(0) == c) {
					outFile.println(chrs[i]);
				}
			}
			
			outFile.flush();
		} catch (Exception e) {}
	}

}
