/******************************************************************************
 *  Purpose: To print harmonic number.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   021-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class Harmonic {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = scanner.nextInt();
		double result = 0;
		while (num > 0) {
			result = result + (double) (1 / num);
			System.out.println("Harmonic number: " + result);
			num--;
		}
	}
}
