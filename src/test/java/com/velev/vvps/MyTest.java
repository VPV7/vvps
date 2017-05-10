package com.velev.vvps;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;



public class MyTest {
	
	@Test
	public void testSumWY() {
		ArrayList<Row> rows = new ArrayList<>();

		rows.add(new Row(10, 5, 3, 2));
		rows.add(new Row(15, 2, 1, 23));
		
		Assert.assertEquals(45, Calculator.sumWY(rows), 0.0);
	}
	
	@Test
	public void testSumYSquare() {
		ArrayList<Row> rows = new ArrayList<>();

		rows.add(new Row(18, 5, 3, 2));
		rows.add(new Row(79, 9, 1, 35));
		
		Assert.assertEquals(10, Calculator.sumYSquare(rows), 0.0);
	}

}
