package t1510;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Hashtable;

public class T1510 {

	public static void main(String[] args) {
		try {
			StreamTokenizer inFile = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			inFile.nextToken();
			int N = (int)inFile.nval;
			
			Hashtable<Integer, Integer> cnt = new Hashtable<>();
			
			for (int i = 0; i < N; ++i) {
				inFile.nextToken();
				Integer k = Integer.valueOf((int)inFile.nval);
				int newVal = 1;
				if (cnt.contains(k)) {
					newVal = cnt.get(k).intValue() + 1;
				}
				cnt.put(k, Integer.valueOf(newVal));
			}
			
			int max = 0;
			int p = 0;
			for (Integer k: cnt.keySet()) {
				int cur = cnt.get(k).intValue();
				if (cur > max) {
					max = cur;
					p = k.intValue();
				}
			}
			
			outFile.println(p);						
			outFile.flush();
		} catch (Exception e) {}
	}

}