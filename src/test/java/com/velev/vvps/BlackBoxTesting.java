package com.velev.vvps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BlackBoxTesting {
	
	@Test
	public void gauss() {
		//input
		List<Row> rows = new ArrayList<>();
		rows.add(new Row(1142, 1060, 325, 201));
		rows.add(new Row(863, 995, 98, 98));
		rows.add(new Row(1065, 3205, 23, 162));
		rows.add(new Row(554, 120, 0, 54));
		rows.add(new Row(983, 2896, 120, 138));
		rows.add(new Row(256, 485, 88, 61));

		List<Double> result = MultipleRegression.calculate(rows);
		
		Assert.assertEquals(6.7013, result.get(0), 0.0001);
		Assert.assertEquals(0.0784, result.get(1), 0.0001);
		Assert.assertEquals(0.0150, result.get(2), 0.0001);
		Assert.assertEquals(0.2461, result.get(3), 0.0001);
		
	}

}
