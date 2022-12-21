package com.jenkins;

import org.testng.annotations.Test;

public class parameterized {

	@Test
	public void testParameter() {
		System.out.println("excute parallel");
		String BROWSER = System.getProperty("browser");
		System.out.println("BROWSER==>"+ BROWSER);
		System.out.println("4565");
	}
}
