package Ex04;

import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {
		int sum = 0;
		int value;
		System.out.println("Rolling the dice...");
		Random r = new Random();
		for(int i = 0; i < 2; i++) {
			value = r.nextInt(6) + 1;
			System.out.println("Die " + (i + 1) + ": " + value);
			sum += value;
		}
		System.out.println("Total value: " + sum);
		if(sum > 7) {
			System.out.println("won!");
		}
		else if(sum <= 7) {
			System.out.println("lost");
		}
	}
	
}
