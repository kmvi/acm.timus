
import java.io.PrintStream;
import java.util.Scanner;

public class T2066 {
	
	enum Sign {
		PLUS, MINUS, MUL
	}
	
	static class Node {
		public Object value;
		public Node left;
		public Node right;
		
		public Node(Object value) {
			this.value = value;
		}
		
		public int getValue() {
			if (value instanceof Sign) {
				if (value == Sign.MINUS) {
					return left.getValue() - right.getValue();
				} else if (value == Sign.PLUS) {
					return left.getValue() + right.getValue();					
				} else {
					return left.getValue() * right.getValue();
				}
			} else {
				return ((Integer)value).intValue();
			}
		}
	}

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int a = inFile.nextInt();
			int b = inFile.nextInt();
			int c = inFile.nextInt();
			
			int result = Integer.MAX_VALUE;
			
			Sign[] s = new Sign[] { Sign.PLUS, Sign.MINUS, Sign.MUL };
			for (int i = 0; i < s.length; ++i) {
				for (int j = 0; j < s.length; ++j) {
					Node root = makeTree(a, s[i], b, s[j], c);
					int value = root.getValue();
					if (value < result)
						result = value;
				}
			}
			
			outFile.println(result);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

	static Node makeTree(int a, Sign f, int b, Sign s, int c) {
		Node root;
		if (f != Sign.MUL) {
			root = new Node(f);
			root.left = new Node(Integer.valueOf(a));
			Node right = new Node(s);
			right.left = new Node(Integer.valueOf(b));
			right.right = new Node(Integer.valueOf(c));
			root.right = right;
		} else {
			root = new Node(s);
			root.right = new Node(Integer.valueOf(c));
			Node left = new Node(f);
			left.left = new Node(Integer.valueOf(a));
			left.right = new Node(Integer.valueOf(b));
			root.left = left;
		}
		return root;
	}
}
