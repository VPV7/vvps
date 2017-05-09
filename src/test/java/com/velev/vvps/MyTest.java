package com.velev.vvps;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;



public class MyTest {
	
	@Test
	public void tes() {
		ArrayList<Row> rows = new ArrayList<>();

		rows.add(new Row(10, 5, 3, 2));
		rows.add(new Row(15, 2, 1, 23));
		
		Assert.assertEquals(45, Calculator.sumWY(rows), 0.0);
	}

}
