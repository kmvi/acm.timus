package t1837;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class T1837 {
	
	public static class Info {
		int pplNo;
		int weight;
		
		Info(int p, int w) {
			pplNo = p;
			weight = w;
		}
	}
	
	static byte[][] m;
	static Hashtable<String, Info> ppl;
	
	static void step(int n, int w) throws Exception {
		for (String s: ppl.keySet()) {
			Info inf = ppl.get(s);
			if (inf.pplNo == n)
				inf.weight = w;
		}
		
		step(getFirst(n), w+1);
		step(getSecond(n), w+1);
	}
	
	static int getFirst(int n) throws Exception {
		for (int i = 0; i < m.length; ++i) {
			if (m[n][i] == 1)
				return i;
		}
		throw new Exception();
	}
	
	static int getSecond(int n) throws Exception {
		for (int i = m.length-1; i >= 0; --i) {
			if (m[n][i] == 1)
				return i;
		}
		throw new Exception();
	}

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			ppl = new Hashtable<>();
			
			int cmdCount = inFile.nextInt();
			String[][] inf = new String[cmdCount][3];
			int cnt = 1;
			
			for (int i = 0; i < cmdCount; ++i) {
				for (int j = 0; j < 3; ++j) {
					String p = inFile.next();
					inf[i][j] = p;
					
					if (!ppl.containsKey(p)) {
						if (p.compareTo("Isenbaev") == 0)
							ppl.put(p, new Info(0, 0));
						else
							ppl.put(p, new Info(cnt++, -1));
					}
				}
			}
			
			int pplCount = ppl.size();
			m = new byte[pplCount][pplCount];
			
			for (int i = 0; i < cmdCount; ++i) {
				int p1 = ppl.get(inf[i][0]).pplNo;
				int p2 = ppl.get(inf[i][1]).pplNo;
				int p3 = ppl.get(inf[i][2]).pplNo;
				
				m[p1][p2] = 1; m[p1][p3] = 1;
				m[p2][p1] = 1; m[p2][p3] = 1;
				m[p3][p1] = 1; m[p3][p2] = 1;
			}
			
			step(getFirst(0), 1);
			step(getSecond(0), 1);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
