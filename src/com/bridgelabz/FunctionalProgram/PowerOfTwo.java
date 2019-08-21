/******************************************************************************
 *  Purpose: To print power of number 2.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   021-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalProgram;

public class PowerOfTwo {
	public static void main(String[] args) {
		int power = Integer.parseInt(args[0]);
		int result = 0;
		for (int i = 0; i <= power; i++) {
			result = (int) Math.pow(2, power);

		}
		System.out.println("power of 2: " + result);
	}
}
