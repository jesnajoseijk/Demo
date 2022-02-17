package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		String string1="Junit";					
        	String string2="Junit1";	
		  assertEquals(string1,string2);	
	}

}
