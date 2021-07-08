package Ex04;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int value;
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Hello," + name + "!");
		System.out.println("Rolling the dice...");
		Random r = new Random();
		for(int i = 0; i < 2; i++) {
			value = r.nextInt(6) + 1;
			System.out.println("Die " + (i + 1) + ": " + value);
			sum += value;
		}
		System.out.println("Total value: " + sum);
	}
	
}
