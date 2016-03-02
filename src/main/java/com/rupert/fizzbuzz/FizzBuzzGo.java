package com.rupert.fizzbuzz;

public class FizzBuzzGo {
    
	public static void main( String[] args ) {
		
		String x = "";
		for ( int i = 1; i < 101; i++ ) {
			FizzBuzzifier fb = new FizzBuzzifier();
			x = fb.fbCheck(i);
			System.out.println( x );
		
		}
        
    }
}
