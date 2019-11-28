package com.bridgelabz.junitprograms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VendingMachineTest {

	@Test
	void vendingTest() {
		
		VendingMachine test=new VendingMachine();
		
		int result=test.vendingMachine(4520);
		
		assertEquals(4520, result);
	}

}
