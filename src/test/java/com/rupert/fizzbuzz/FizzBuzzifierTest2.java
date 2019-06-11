package com.rupert.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzifierTest2 {
	
	FizzBuzzifier2 fb = new FizzBuzzifier2();
   
	@Test
    public void one_Returns_1() {
        assertEquals(true, fb.fbCheck(1));   
    }
	
}
