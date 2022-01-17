package com.devopsusach2020;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevOpsUsach2020ApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	public void testDoSomething() {
	  DevOpsUsach2020ApplicationTests myClass = new DevOpsUsach2020ApplicationTests();
	  assertNull(myClass.contextLoads());  // JUnit assertion
	  assertThat(myClass.contextLoads()).isNull();  // Fest assertion
	}

}
