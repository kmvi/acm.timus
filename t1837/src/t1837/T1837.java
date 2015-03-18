package t1837;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class T1837 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();			
			HashMap<String, Integer> names = new HashMap<>();
			byte[][] g = new byte[3*n][3*n];
			
			int index = 0;
			for (int i = 0; i < n; ++i) {
				int[] ind = new int[3];
				String[] nm = new String[3];
				for (int j = 0; j < 3; ++j) {
					nm[j] = inFile.next();
					if (names.containsKey(nm[j]))
						ind[j] = names.get(nm[j]).intValue();
					else {
						names.put(nm[j], index);
						ind[j] = index++;
					}
				}				
				
				g[ind[0]][ind[1]] = 1;
				g[ind[0]][ind[2]] = 1;
				g[ind[1]][ind[0]] = 1;
				g[ind[2]][ind[0]] = 1;
				g[ind[1]][ind[2]] = 1;
				g[ind[2]][ind[1]] = 1;
			}
			
			int sz = names.size();
			int[] w = new int[sz];
			Arrays.fill(w, Integer.MAX_VALUE);
			
			if (names.containsKey("Isenbaev")) {
				LinkedList<Integer> stk = new LinkedList<>();
				Stack<Integer> proc = new Stack<>();
				Integer isInd = names.get("Isenbaev");
				stk.add(isInd);
				w[isInd.intValue()] = 0;
				
				while (stk.size() > 0) {
					int ind = stk.poll().intValue();
					int wInd = w[ind];
					proc.push(Integer.valueOf(ind));
					
					for (int i = 0; i < sz; ++i) {
						if (g[ind][i] == 1 && !proc.contains(Integer.valueOf(i)) && !stk.contains(Integer.valueOf(i))) {
							stk.add(Integer.valueOf(i));
							if (w[i] == Integer.MAX_VALUE)
								w[i] = wInd + 1;
						}
					}
				}
			}
			
			String[] sortedNames = names.keySet().toArray(new String[0]);
			Arrays.sort(sortedNames);
			
			for (String k : sortedNames) {
				int m = w[names.get(k).intValue()];
				outFile.print(k);
				outFile.print(" ");
				if (m == Integer.MAX_VALUE)
					outFile.println("undefined");
				else
					outFile.println(m);				
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
