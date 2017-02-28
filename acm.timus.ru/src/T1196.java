// http://acm.timus.ru/problem.aspx?space=1&num=1196


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;

public class T1196 {

	public static void main(String[] args) throws IOException {
		try {
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));			
			BufferedReader inFile = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(inFile.readLine());
			HashSet<Long> t = new HashSet<>();
			
			for (int i = 0; i < N; ++i) {
				t.add(Long.parseLong(inFile.readLine()));
			}
			
			int M = Integer.parseInt(inFile.readLine());
			int cnt = 0;
			
			for (int i = 0; i < M; ++i) {
				if (t.contains(Long.parseLong(inFile.readLine())))
					cnt++;
			}
			
			outFile.println(cnt);						
			outFile.flush();
		} catch (Exception e) {}
	}

}