package com.junit.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitClass {

	@Test
	public void addTest() {
		DeveloperJavaCode dc = new DeveloperJavaCode();
		int result = dc.add(100, 200);
		assertEquals(300,result);
		System.out.println("Passed...");
	}
	@Test
	public void concateTest()
	{
		DeveloperJavaCode dc = new DeveloperJavaCode();
		String result = dc.concate("Rahul", " Jaiswal");
		assertEquals("Rahul Jaiswal",result);
		System.out.println("Passed...");
	}

}
