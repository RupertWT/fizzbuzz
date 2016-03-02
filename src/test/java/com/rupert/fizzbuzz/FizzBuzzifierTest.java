package com.rupert.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzifierTest {
	
	FizzBuzzifier fb = new FizzBuzzifier();
   
	@Test
    public void one_Returns_1() {
        assertEquals("1", fb.fbCheck(1));   
    }
	
	@Test
    public void three_Returns_Fizz() {
        assertEquals("Fizz", fb.fbCheck(3));   
    }
	
	@Test
    public void five_Returns_Buzz() {
        assertEquals("Buzz", fb.fbCheck(5));   
    }
	
	@Test
    public void nine_Returns_Fizz() {
        assertEquals("Fizz", fb.fbCheck(9));   
    }
	
	@Test
    public void ten_Returns_Fizz() {
        assertEquals("Buzz", fb.fbCheck(10));   
    }
	
	@Test
    public void fifteen_Returns_Fizz() {
        assertEquals("BuzzFizz", fb.fbCheck(15));   
    }
	
}
