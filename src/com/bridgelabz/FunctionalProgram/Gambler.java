/******************************************************************************
 *  Purpose: To play the game and print percentage of wins and loss.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   021-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
		int stack;
		int goal;
		int trials;
		int wins = 0;
		int loss = 0;
		int bets = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter trial: ");
		trials = scanner.nextInt();
		System.out.println("Enter stack: ");
		stack = scanner.nextInt();
		System.out.println("Enter goal: ");
		goal = scanner.nextInt();

		for (int i = 0; i <= trials; i++) {
			int cash = stack;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5) {
					cash++;
				} else {
					cash--;
				}
				if (cash == goal) {
					wins++;
				}
			}

			System.out.println(wins + "wins of" + trials);
			System.out.println("percentage of wins: " + (100 * wins / trials));
			System.out.println("percentage of loss: " + (100 - (100 * wins / trials)));
		}
	}
}
