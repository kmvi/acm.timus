// http://acm.timus.ru/problem.aspx?space=1&num=1567


import java.io.PrintStream;
import java.util.Hashtable;
import java.util.Scanner;

public class T1567 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			String chr = "abcdefghijklmnopqrstuvwxyz";			
			Hashtable<Character, Integer> weight = new Hashtable<>();
			
			int n = 0;
			for (int i = 0; i < chr.length(); ++i) {
				weight.put(new Character(chr.charAt(i)), new Integer((n++ % 3) + 1));
			}
			
			weight.put('.', 1); weight.put(',', 2); weight.put('!', 3);
			weight.put(' ', 1);
			
			String str = inFile.nextLine();
			
			int cost = 0;
			for (int i = 0; i < str.length(); ++i) {
				cost += weight.get(new Character(str.charAt(i)));
			}
			
			outFile.println(cost);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
