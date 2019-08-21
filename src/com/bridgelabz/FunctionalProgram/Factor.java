/******************************************************************************
 *  Purpose: To print factors of given number.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   021-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		float num=0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = scanner.nextInt();
		for(int i=0;i*i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("factors are: "+i);
			}
		}
}
}
