/******************************************************************************
 *  Purpose: To flip a coin and print percentage of head and tail.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   021-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		float flip;
		int count = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter coin flip: ");
		flip = scanner.nextInt();
		if (Math.random() > 0.5) {
			System.out.println("It's a head");
			count++;
		} else {
			System.out.println("It's a tail");
			count++;
		}
		System.out.println("percentage of heads: "+(flip/count)/100);
		System.out.println("percentage of tails: "+(100-(flip/count)/100));
	}
}
