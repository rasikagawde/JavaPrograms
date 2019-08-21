/******************************************************************************
 *  Purpose: To calculate Euclidian distance.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   021-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalProgram;

import java.util.concurrent.TimeUnit;

public class StopWatch {
	public static void main(String[] args) throws InterruptedException 
	{
		long StartTime=System.currentTimeMillis();
		TimeUnit.SECONDS.sleep(2);
		long endtTime=System.currentTimeMillis();
		long TimeElapsed=endtTime-StartTime;
		System.out.println("Execution time: "+TimeElapsed);
	}
}
