package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		String string1="Junit";					
        	String string2="Junit";	
		  assertEquals(string1,string2);	
	}

}
