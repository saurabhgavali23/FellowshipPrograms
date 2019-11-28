package com.bridgelabz.junitprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverstionTest {

	@Test
	void test() {
		ConversionFtoC test=new ConversionFtoC();
		
		double f=test.conversionCtoF(87, 36);
		double c=test.conversionFtoC(78, 65);
		
		assertEquals(84.0, f);
		assertEquals(46.0, c);
		
	}

}
