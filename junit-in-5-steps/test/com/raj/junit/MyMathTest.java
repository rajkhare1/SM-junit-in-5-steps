package com.raj.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	@Test
	void sumWith3Numbers() {
		System.out.println("Test1");
       assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	void sumWith1Numbers() {
		System.out.println("Test2");
       assertEquals(3, myMath.sum(new int[] {3}));
	}

}
