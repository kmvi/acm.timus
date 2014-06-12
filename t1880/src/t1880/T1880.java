// http://acm.timus.ru/problem.aspx?space=1&num=1880

package t1880;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Hashtable;

public class T1880 {
	
	static Hashtable<Integer, Integer> cnt = new Hashtable<>();
	
	static void Count(int n, StreamTokenizer inFile) throws IOException {
		for (int i = 0; i < n; ++i) {
			inFile.nextToken();
			Integer k = Integer.valueOf((int)inFile.nval);				
			Integer c = cnt.get(k);
			if (c != null) {
				cnt.put(k, Integer.valueOf(c.intValue()+1));
			} else {
				cnt.put(k, Integer.valueOf(1));
			}
		}
	}

	public static void main(String[] args) {
		try {
			StreamTokenizer inFile = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			int n;
			
			inFile.nextToken();
			n = (int)inFile.nval;			
			Count(n, inFile);
			
			inFile.nextToken();
			n = (int)inFile.nval;			
			Count(n, inFile);
			
			inFile.nextToken();
			n = (int)inFile.nval;			
			Count(n, inFile);
			
			int out = 0;
			for (Integer i: cnt.keySet()) {
				int v = cnt.get(i);
				if (v == 3)
					out++;
			}
			
			outFile.println(out);						
			outFile.flush();
		} catch (Exception e) {}
	}

}