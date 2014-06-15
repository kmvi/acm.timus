package t1563;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;

public class T1563 {

	public static void main(String[] args) {
		try {
			BufferedReader inFile = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			HashSet<String> s = new HashSet<>();
			
			int n = Integer.parseInt(inFile.readLine());
			
			int cnt = 0;
			while (n-- > 0) {
				String ln = inFile.readLine().toUpperCase();
				if (s.contains(ln)) cnt++;
				else s.add(ln);
			}
			
			outFile.println(cnt);
						
			outFile.flush();
		} catch (Exception e) {}
	}

}