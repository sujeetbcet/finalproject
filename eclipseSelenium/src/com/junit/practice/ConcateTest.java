package com.junit.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcateTest {

	DeveloperJavaCode dc;
	
	@Test
	public void concateTest() {
		dc = new DeveloperJavaCode();
		String result = dc.concate("Sujeet ", "Kumar");
		assertEquals("Sujeet Kumar", result);
		System.out.println("Passed...");
	}
	@Test
	public void concateTest2()
	{
		dc=new DeveloperJavaCode();
		String actual=dc.concate("Hello", "World...!");
		assertEquals("Hello World", actual);
		System.out.println("Passed...");
	}

}
