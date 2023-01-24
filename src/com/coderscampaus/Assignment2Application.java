package com.coderscampaus;

import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		numberGuessingGame();

	}

	private static void numberGuessingGame() {

		Scanner scanner = new Scanner(System.in);
		// generate a random number
		int theRandomNumber = (int) Math.floor(Math.random() * 100);

		int i;
		//initialized to 5
		int x = 5;

		int inputNumber;

		extracted();

		for (i = 0; i < x; i++) {
			
			inputNumber = scanner.nextInt();
			
			if (inputNumber > 100 || inputNumber < 1) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				extracted();
				//i will not change if this condition is true
				i = i - 1;
			} else if (inputNumber == theRandomNumber) {

				System.out.println("You win!");
				break;
			}

			else if (theRandomNumber > inputNumber && i != x - 1) {
				System.out.println("Please pick a higher number");
			}

			else if (theRandomNumber < inputNumber && i != x - 1) {
				System.out.println("Please pick a lower number");
			}
		}
		if (i == x) {

			System.out.println("You Lose!");
			System.out.println("The number to guess was: " + theRandomNumber);
			scanner.close();
		}

	}

	private static void extracted() {
		System.out.println("Pick a number between 1 and 100");
	}

}
