/******************************************************************************
 *  Purpose: To calculate Euclidian distance.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   021-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		float axisX;
		float axisY;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter X axis: ");
		axisX = scanner.nextInt();
		System.out.println("Enter Y axis: ");
		axisY = scanner.nextInt();
		float sqrt = (float) (Math.sqrt(axisX * axisX + axisY * axisY));
		System.out.println("Euclidian distance: " + sqrt);
	}
}
