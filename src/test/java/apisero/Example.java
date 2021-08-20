package apisero;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class Example {
	static Oddeven obj;
	static Prime obj1;
	
	@BeforeEach
	public void abc1(){
		System.out.println("I am BeforeAll");
	}
	@BeforeAll
	public static void abc3(){
		obj=new Oddeven();
		obj1=new Prime();
		System.out.println("I am BeforeEach");
	}
	
	@Test
	public void abc8(){
		assertEquals(obj.evenodd(100),true);
		assertEquals(obj1.Primeornot(100),false);
		System.out.println("I am TestCase");
	}
	@Test
	public void abc4(){
		assertEquals(obj.evenodd(101),false);
		assertEquals(obj1.Primeornot(101),true);
		System.out.println("I am Testcase");
	}
	@AfterEach
	public void abc5(){
		System.out.println("I am AfterEach");
		
	}
	@AfterAll
	public static void abc6(){
		System.out.println("I am AfterAll");
	}
	
	
}
