import java.math.BigInteger;
import java.util.Scanner;

public class cf686A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		BigInteger x = sc.nextBigInteger();
		sc.nextLine();
		
		int dist = 0;
		
		String s;
		while(n-->0) {
			s = sc.nextLine();
			BigInteger a = new BigInteger(s.substring(2));
			if (s.charAt(0) == '+') {
				x = x.add(new BigInteger(""+a));
			} else {
				if (x.compareTo(a) == 0 || x.compareTo(a) == 1) {
					x = x.subtract(a);
				} else {
					dist++;
				}
			}
		}
		System.out.println(x + " " + dist);
	}
}
