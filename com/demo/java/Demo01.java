package com.demo.java;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		// We are playing a lottery game and the lucky number is 17; We want to keep
		// asking the user to enter any numbers from 1-20; until he guesses the lucky
		// number --> In that case we print "Congrats, you won!"
		// You can try to solve it with do-while or while, whichever is the best
		// choice...

		Scanner scan = new Scanner(System.in);
		int luck = 17;
		int guess;

		do {
			System.out.println("Please enter any numbers from 1-20");
			guess = scan.nextInt();
		} while (guess != luck);

		System.out.println("Congrats, you won");

	}
}
