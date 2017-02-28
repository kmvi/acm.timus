
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;

public class T1446 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			LinkedList<String> s = new LinkedList<>();
			LinkedList<String> r = new LinkedList<>();
			LinkedList<String> h = new LinkedList<>();
			LinkedList<String> g = new LinkedList<>();
			
			int n = inFile.nextInt();
			while (n > 0) {
				String name = inFile.nextLine();
				if (name.isEmpty())
					continue;
				
				String f = inFile.nextLine();
				
				if (f.compareTo("Slytherin") == 0)
					s.add(name);
				else if (f.compareTo("Hufflepuff") == 0)
					h.add(name);
				else if (f.compareTo("Gryffindor") == 0)
					g.add(name);
				else
					r.add(name);
				
				n--;
			}
			
			outFile.println("Slytherin:");
			for (String name: s)
				outFile.println(name);
			
			outFile.println();
			outFile.println("Hufflepuff:");
			for (String name: h)
				outFile.println(name);
			
			outFile.println();
			outFile.println("Gryffindor:");
			for (String name: g)
				outFile.println(name);
			
			outFile.println();
			outFile.println("Ravenclaw:");
			for (String name: r)
				outFile.println(name);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
