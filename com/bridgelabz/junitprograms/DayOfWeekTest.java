package com.bridgelabz.junitprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DayOfWeekTest {

	@Test
	void test() {
		
		DayOfWeek test=new DayOfWeek();
		String day=test.dayOfWeek(23, 01, 1996);
		
		assertEquals("Monday", day);
	}

}
