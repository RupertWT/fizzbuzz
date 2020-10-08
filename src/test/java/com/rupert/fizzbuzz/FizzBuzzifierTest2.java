package com.rupert.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzifierTest2 {
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	FizzBuzzifier2 fb2 = new FizzBuzzifier2();
   
	@Test
    public void one_Returns_1() {
        assertEquals(1, fb2.fbCheck(1));   
    }
	
}
