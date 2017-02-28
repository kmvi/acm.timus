
import java.io.PrintStream;
import java.util.Hashtable;
import java.util.Scanner;

public class T1617 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			Hashtable<Integer, Integer> cnt = new Hashtable<>();
			
			int n = inFile.nextInt();
			while (n-- > 0) {
				Integer v = Integer.valueOf(inFile.nextInt());
				if (cnt.containsKey(v)) {
					int t = cnt.get(v).intValue()+1;
					cnt.put(v, Integer.valueOf(t));
				} else {
					cnt.put(v, Integer.valueOf(1));
				}
			}
			
			int p = 0;
			for (Integer k: cnt.keySet()) {
				int v = cnt.get(k).intValue();
				p += v / 4;
			}
			
			outFile.println(p);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
