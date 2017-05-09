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

		List<Double> result = MutlipleRegression.calculate(rows);
		
		Assert.assertEquals(6.7013, result.get(0), 0.0001);
		Assert.assertEquals(0.0784, result.get(1), 0.0001);
		Assert.assertEquals(0.0150, result.get(2), 0.0001);
		Assert.assertEquals(0.2461, result.get(3), 0.0001);
		
	}

}
