import java.util.Scanner;

public class cf064A {
	
	private static int[] fac = {1,2,6,24,120,720,5040,40320,362880,3628800};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(fac[sc.nextInt()-1]);
	}
}