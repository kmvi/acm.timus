
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class T1021 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n1 = inFile.nextInt();
			int[] list1 = new int[n1];
			for (int i = 0; i < n1; ++i)
				list1[i] = inFile.nextInt();
			
			int n2 = inFile.nextInt();
			int[] list2 = new int[n2];
			for (int i = 0; i < n2; ++i)
				list2[n2-i-1] = inFile.nextInt();
			
			boolean found = false;
			for (int i = 0; i < n1; ++i) {
				int ind = Arrays.binarySearch(list2, 10000 - list1[i]);
				if (ind >= 0)
					found = true;
			}
			
			outFile.println(found ? "YES" : "NO");
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
