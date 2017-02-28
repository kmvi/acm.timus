// http://acm.timus.ru/problem.aspx?space=1&num=1001

// использовать массив - гораздо быстрее, чем добавлять в начало списка элементы по одному
// медлен и вариант сразу формировать строку через стрингбилдер и потом вывести ее

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1001 {

	public static void main(String[] args) {
		try {
			StreamTokenizer inFile = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			double[] sqrts = new double[132000];
			int ind = 0;
			
			while (inFile.nextToken() != StreamTokenizer.TT_EOF) {
				if (inFile.ttype == StreamTokenizer.TT_EOL)
					continue;
				sqrts[ind++] = Math.sqrt(inFile.nval);
			}
			
			for (int i = ind-1; i >= 0; --i)
				outFile.print(String.format("%.4f\n", sqrts[i]));
			
			outFile.flush();
		} catch (Exception e) {}
	}

}
