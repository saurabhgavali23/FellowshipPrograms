package com.bridgelabz.junitprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonthlyTest {

	@Test
	void test() {
		MonthlyPayment test=new MonthlyPayment();
		
		double pay=test.monthlypay(800, 466, 7000);
		assertEquals(45136, pay);
	}

}
