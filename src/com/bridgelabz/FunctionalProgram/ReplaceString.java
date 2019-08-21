/******************************************************************************
 *  Purpose: To print Username by replace string function.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   021-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		String str1 = "Hello Username, How are you?";
		String str2 = null;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Username: ");
		str2 = scanner.next();
		System.out.println(str1.replace("Username", str2));
	}

}
