import java.util.*;

public class cf268A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int res = 0;
		ArrayList<Integer> home = new ArrayList<>();
		ArrayList<Integer> away = new ArrayList<>();
		
		// O(n^2)
		for (int i = 0; i < n; i++) {
			home.add(sc.nextInt());
			away.add(sc.nextInt());
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int x = home.get(i);
				if (x == away.get(j)) {
					res++;
				}
			}
		}
		System.out.println(res);
	}
}