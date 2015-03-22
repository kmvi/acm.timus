package t1022;

import java.io.PrintStream;
import java.util.*;

public class T1022 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			boolean[][] w = new boolean[n][n];
			for (int i = 0; i < n; ++i) {
				while (true) {
					int k = inFile.nextInt();
					if (k == 0)
						break;
					
					w[i][k - 1] = true;
				}
			}
			
			boolean[] roots = new boolean[n];
			Arrays.fill(roots, true);
			
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					if (w[i][j])
						roots[j] = false;
				}
			}
			
			int root = 0;
			while (root < n) {
				if (roots[root])
					break;
				++root;
			}
			
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(Integer.valueOf(root));
			
			LinkedList<Integer> result = new LinkedList<Integer>();
			
			while (q.size() != 0) {
				Integer top = q.poll().intValue();
				
				int next = top.intValue();
				boolean canAdd = true;
				for (int i = 0; i < n; ++i) {
					if (w[i][next]) { // нашли родителя
						Integer iVal = Integer.valueOf(i);
						if (!result.contains(iVal)) {
							canAdd = false;
							if (!q.contains(iVal))
								q.add(iVal);
						}
					}
				}
				
				if (canAdd) {
					if (!result.contains(top))
						result.add(top);
					for (int i = 0; i < n; ++i) {
						if (w[next][i]) {
							q.add(Integer.valueOf(i));
						}
					}
				} else {
					q.add(top);
				}
			}
			
			int sz = result.size();
			int cnt = 1;
			for (Integer i : result) {
				outFile.print(i.intValue() + 1);
				if (cnt++ == sz) outFile.println();
				else outFile.print(" ");
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
