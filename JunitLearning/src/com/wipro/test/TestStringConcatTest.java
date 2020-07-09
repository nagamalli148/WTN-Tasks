package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringConcatTest {

	@Test
	public void testStringConcatTest() {
		TestStringConcat stringconcat=new TestStringConcat();
		String result=stringconcat.StringConcat("a","b");
		assertEquals("ab",result);
	}

}