package t1370;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1370 {
	
	public static void rotate(int[] arr)
	{
		int first = arr[0];
		for (int i = 0; i < arr.length-1; ++i)
			arr[i] = arr[i+1];
		
		arr[arr.length-1] = first;		
	}

	public static void main(String[] args) {
		try {
			StreamTokenizer inFile = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			inFile.nextToken();
			int n = (int)inFile.nval;
			
			inFile.nextToken();
			int m = (int)inFile.nval;
			
			int[] dig = new int[n];
			for (int i = 0; i < n; ++i) {
				inFile.nextToken();
				dig[i] = (int)inFile.nval;
			}
			
			for (int i = 0; i < m; ++i) {
				rotate(dig);
			}
			
			for (int i = 0; i < 10; ++i) {
				outFile.print(dig[i]);
			}
						
			outFile.flush();
		} catch (Exception e) {}
	}

}