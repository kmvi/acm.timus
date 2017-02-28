
import java.io.PrintStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class T1777 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			LinkedList<Long> lst = new LinkedList<>();
			
			for (int i = 0; i < 3; ++i)
				lst.add(inFile.nextLong());
			
			long show = 1;			
			while (true) {				
				Collections.sort(lst);
				show++;
				
				long curMin = Long.MAX_VALUE;
				for (int i = 0; i < lst.size()-1; ++i) {
					long x1 = lst.get(i);
					long x2 = lst.get(i+1);
					long m = x2 - x1;
					if (m < curMin)
						curMin = m;
				}
			
				if (lst.contains(curMin))
					break;
				
				lst.add(curMin);
			}			
			
			outFile.println(show);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
