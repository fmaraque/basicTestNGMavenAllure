package com.javacodegeeks.testng.maven.testngMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgMavenExampleTest {
	
	@Test
	public void exampleOfTestNgMaven() {
		System.out.println("This is TestNG-Maven Example");
	}
	
	@Test
	public void areTheNumbersEquals() {
		Assert.assertEquals(3, 3,"Number aren't the same");
	}
}
