import java.util.ArrayList;
import java.util.Scanner;

public class cf490A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		int x;
		for(int i = 1; i < n+1; i++) {
			x = sc.nextInt();
			if (x == 1) a.add(i);
			if (x == 2) b.add(i);
			if (x == 3) c.add(i);
		}
		int w = Math.min(c.size(), Math.min(a.size(), b.size()));
		System.out.println(w);
		while (w-- > 0) {
			System.out.println(a.get(w) + " " + b.get(w) + " " + c.get(w));
		}
	}
}
