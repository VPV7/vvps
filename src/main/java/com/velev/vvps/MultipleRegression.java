package com.velev.vvps;

import static com.velev.vvps.Calculator.firstRow;
import static com.velev.vvps.Calculator.fourthRow;
import static com.velev.vvps.Calculator.secondRow;
import static com.velev.vvps.Calculator.thirdRow;

import java.util.ArrayList;
import java.util.List;

public class MultipleRegression {

	public static List<Double> calculate(List<Row> rows) {

		double[][] matrix = new double[4][5];
		// output
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

		gaussianEliminationMethod(matrix);

		return result(matrix);

	}

	public static List<Double> result(double[][] matrix) {

		List<Double> resultList = new ArrayList<Double>();
		
		for (int i = matrix.length - 1; i > -1; i--) {
			
			double n = resultList.get(i);
			n = matrix[i][matrix.length] / matrix[i][i];
			
			for (int k = i - 1; k > -1; k--) {
				
				matrix[k][matrix.length] -= matrix[k][i] * resultList.get(i);
				
			}
		}
		
		return resultList;
	}

	public static void gaussianEliminationMethod(double[][] matrix) {

		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			// Search for maximum in this column
			double maxEl = Math.abs(matrix[i][i]);
			int maxRow = i;
			for (int k = i + 1; k < n; k++) {
				if (Math.abs(matrix[k][i]) > maxEl) {
					maxEl = Math.abs(matrix[k][i]);
					maxRow = k;
				}
			}

			// Swap maximum row with current row (column by column)
			for (int k = i; k < n + 1; k++) {
				double tmp = matrix[maxRow][k];
				matrix[maxRow][k] = matrix[i][k];
				matrix[i][k] = tmp;
			}

			// Make all rows below this one 0 in current column
			for (int k = i + 1; k < n; k++) {
				double c = -matrix[k][i] / matrix[i][i];
				for (int j = i; j < n + 1; j++) {
					if (i == j) {
						matrix[k][j] = 0;
					} else {
						matrix[k][j] += c * matrix[i][j];
					}
				}
			}
		}

	}

}
