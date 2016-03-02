package com.rupert.fizzbuzz;

public class FizzBuzzifier {
    
	public String fbCheck ( int i ) {
		
		if ( i % 3 == 0 && i % 5 == 0 ) {
			return "BuzzFizz";
		} else if ( i % 3 == 0 ) {
			return "Fizz";
		} else if ( i % 5 == 0 ) {
			return "Buzz";
		}
		
        return Integer.toString(i);
 
    }
}
