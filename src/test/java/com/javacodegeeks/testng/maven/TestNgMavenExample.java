package com.javacodegeeks.testng.maven;

import org.testng.annotations.Test;

public class TestNgMavenExample {

	@Test
	public void exampleOfTestNgMaven() {
		System.out.println("This is TestNG-Maven Example");
	}
	
	@Test
	public void test1() {
		System.out.println("This is test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("This is test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("This is test 4");
	}
	
	@Test
	public void test5() {
		System.out.println("This is test ");
	}
	
	@Test
	public void test6() {
		System.out.println("This is test 6");
		assert(false);
	}
}
