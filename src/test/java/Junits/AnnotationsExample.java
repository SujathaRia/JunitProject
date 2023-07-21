package Junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.Calculator;

public class AnnotationsExample {
	
	
	@BeforeAll
	public static void beforeall() {
	
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforejunit() {
	
		System.out.println("Before Junit");
	}
	
	@Test()
	public void test1() {
		
		int result = Calculator.Add(5, 5);
		Assertions.assertEquals(10, result);
	}
	
	@Test()
	public void test2() {
		
		int result = Calculator.Add(4, 5);
		Assertions.assertEquals(9, result);
	}
	
	@AfterEach
	public void afterjunit() {
		
		System.out.println("After Junit");
	}
	
	@AfterAll
	public static void Afterall() {
	
		System.out.println("After All");
	}

}

