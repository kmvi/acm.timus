package t1688;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1688 {

	public static void main(String[] args) {
		try {
			StreamTokenizer inFile = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			inFile.nextToken();
			long n = (long)inFile.nval;
			
			inFile.nextToken();
			long m = (long)inFile.nval;
			
			long val = 0;
			int cnt = 1;
			boolean f = false;
			while (m-- > 0) {
				inFile.nextToken();
				long s = (long)inFile.nval;
				val += s;
				if (((double)val / 3.0 - (double)n) < 1e-6)
					cnt++;
				else
					f = true;
			}
			
			if (f)
				outFile.println(String.format("Free after %d times.", cnt));
			else
				outFile.println("Team.GOV!");
			
			outFile.flush();
		} catch (Exception e) {}
	}

}