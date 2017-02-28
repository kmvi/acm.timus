// http://acm.timus.ru/problem.aspx?space=1&num=1496

package t1496;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Hashtable;

public class T1496 {
	
	public static void main(String[] args) {
		try {
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			BufferedReader inFile = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(inFile.readLine());
			
			Hashtable<String, Integer> counter = new Hashtable<>();
			
			for (int i = 0; i < N; ++i) {
				String ln = inFile.readLine().trim();
				if (counter.containsKey(ln)) {
					int cnt = counter.get(ln);
					counter.put(ln, Integer.valueOf(cnt + 1));
				} else {
					counter.put(ln, Integer.valueOf(1));
				}
			}
			
			for (String k: counter.keySet()) {
				int cnt = counter.get(k);
				if (cnt > 1)
					outFile.println(k);
			}
			
			outFile.flush();
		} catch (Exception e) {}
	}

}
