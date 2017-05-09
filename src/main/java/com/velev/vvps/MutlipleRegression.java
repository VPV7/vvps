package com.velev.vvps;

import static com.velev.vvps.Calculator.firstRow;
import static com.velev.vvps.Calculator.fourthRow;
import static com.velev.vvps.Calculator.secondRow;
import static com.velev.vvps.Calculator.thirdRow;

import java.util.List;

public class MutlipleRegression {


	public static List<Double> calculate(List<Row> rows) {
		
		double[][] matrix = new double[4][5];
		//output
		firstRow(rows, matrix);

		secondRow(rows, matrix);
		thirdRow(rows, matrix);
		fourthRow(rows, matrix);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		zeroUnderDiagonal(matrix);
		
		return result(matrix);
		
	}

	private static List<Double> result(double[][] matrix) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void zeroUnderDiagonal(double[][] matrix) {
		// TODO Auto-generated method stub
		
	}


	

}
