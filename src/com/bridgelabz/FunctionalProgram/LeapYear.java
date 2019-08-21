/******************************************************************************
 *  Purpose: To print the given year is leap year or not.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   021-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year: ");
		year = scanner.nextInt();
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}
	}
}
