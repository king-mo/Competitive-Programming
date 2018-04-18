import java.util.Scanner;

public class cf381A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int first = 0;
		int second = 0;
		boolean firstTurn = true;
		
		int[] cards = new int[n];
		
		for (int i = 0; i < n; i++) {
			cards[i] = sc.nextInt();
		}
		
		int start = 0;
		int end = n-1;
		
		while(n-- > 0) {
			if(cards[start] > cards[end]) {
				if (firstTurn) {
					first += cards[start];
				} else {
					second += cards[start];
				}
				start++;
				firstTurn = !firstTurn;
			} else {
				if (firstTurn) {
					first += cards[end];
				} else {
					second += cards[end];
				}
				firstTurn = !firstTurn;
				end--;
			}
		}
		
		
		System.out.println(first + " " + second);
	}
}