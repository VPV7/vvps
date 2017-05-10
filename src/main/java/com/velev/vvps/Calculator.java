package com.velev.vvps;

import java.util.List;

public class Calculator {
	
	public static void firstRow(List<Row> rows, double[][] matrix) {
		matrix[0][0] = rows.size();

		matrix[0][1] = sumW(rows);

		matrix[0][2] = sumX(rows);

		matrix[0][3] = sumY(rows);

		matrix[0][4] = sumZ(rows);
	}
	
	public static void secondRow(List<Row> rows, double[][] matrix) {
		
		matrix[1][0] = sumW(rows);
		
		matrix[1][1] = sumWSquare(rows);
		
		matrix[1][2] = sumWX(rows);
		
		matrix[1][3] = sumWY(rows);
		
		matrix[1][4] = sumWZ(rows);
	}
	
	public static void thirdRow(List<Row> rows, double[][] matrix) {
				
		matrix[2][0] = sumX(rows);
		
		matrix[2][1] = sumWX(rows);
		
		matrix[2][2] = sumXSquare(rows);
		
		matrix[2][3] = sumXY(rows);
		
		matrix[2][4] = sumXZ(rows);
		
	}
	
	public static void fourthRow(List<Row> rows, double[][] matrix) {
		
		matrix[3][0] = sumY(rows);
		
		matrix[3][1] = sumWY(rows);
		
		matrix[3][2] = sumXY(rows);
		
		matrix[3][3] = sumYSquare(rows);
		
		matrix[3][4] = sumYZ(rows);
		
	}	

	public static double sumYZ(List<Row> rows) {
		
		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).y * rows.get(i).z;

		}

		return sum;
	}

	public static double sumYSquare(List<Row> rows) {
		
		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).y * rows.get(i).y;

		}

		return sum;
	}

	public static double sumXZ(List<Row> rows) {
		
		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).x * rows.get(i).z;

		}

		return sum;
	}

	public static double sumXY(List<Row> rows) {
		
		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).x * rows.get(i).y;

		}

		return sum;
		
	}

	public static double sumXSquare(List<Row> rows) {
		
		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).x * rows.get(i).x;

		}

		return sum;
	}

	
	public static double sumWX(List<Row> rows) {

		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).w * rows.get(i).x;

		}

		return sum;
	}

	public static double sumWY(List<Row> rows) {

		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).w * rows.get(i).y;

		}

		return sum;
	}

	public static double sumWZ(List<Row> rows) {

		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).w * rows.get(i).z;

		}

		return sum;
	}

	public static double sumWSquare(List<Row> rows) {

		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).w * rows.get(i).w;

		}

		return sum;
	}
	
	public static double sumW(List<Row> rows) {

		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).w;

		}

		return sum;
	}

	public static double sumY(List<Row> rows) {

		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).y;

		}

		return sum;
	}

	public static double sumZ(List<Row> rows) {

		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).z;

		}

		return sum;
	}

	public static double sumX(List<Row> rows) {

		double sum = 0;

		for (int i = 0; i < rows.size(); i++) {

			sum += rows.get(i).x;

		}

		return sum;
	}
}
