package com.basic;

public class ErrorCorrection5 {
	public static void main(String args[]) {
		// Error Correction 5
		for ( int x = 1; x <= 10; x++ )
		{
		for ( int z = 1; z <= 5; z++ )
		System.out.print( '@' );

		 System.out.println();
		 } // end outer for
		
	// What does the program do
		int i,j,k;
		
		for (i= 1; i <= 5; i++ )
		{
		for (j= 1; j <= 3; j++ )
		{
		for (k= 1; k <= 4; k++ )
		System.out.print( '*' );
		System.out.println();
		} // end inner for
		System.out.println();
		} // end outer for


	}
	
}
