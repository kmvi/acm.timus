package t1126;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T1126 {

	public static void main(String[] args) {
		try {
			StreamTokenizer inFile = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			inFile.nextToken();
			int m = (int)inFile.nval;
			
			Queue<Integer> elems = new LinkedList<Integer>();
			Deque<Integer> max = new LinkedList<Integer>();
			
			while (true) {
				if (inFile.nextToken() == StreamTokenizer.TT_EOF)
					break;
				
				int elem = (int)inFile.nval;
				elems.add(elem);
				
				max.removeIf(p -> p < elem);
				max.add(elem);
				
				if (elems.size() == m) {
					Integer t = elems.remove();
					Integer k = max.peek();
					outFile.println(k);
					if (k == t)
						max.remove();
				}
			}
						
			outFile.flush();
		} catch (Exception e) {}
	}

}