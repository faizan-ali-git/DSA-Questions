package com.subsetproblems;

import java.util.ArrayList;
import java.util.Iterator;

public class MazeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mazeSolverDiagonal("", 3, 3);
		// System.out.println(mazeSolverDiagonalReturn("", 3, 3));
		boolean[][] arr = new boolean[3][3];
		mazeSolverLRUD("", 3, 3, arr);
	}

	public static void mazeSolver(String p, int r, int c) {

		if (r == 1 && c == 1) {
			System.out.println(p);
			return;
		}
		if (c >= 1)
			mazeSolver(p + "R", r, c - 1);
		if (r >= 1)
			mazeSolver(p + "D", r - 1, c);
	}

	public static void mazeSolverDiagonal(String p, int r, int c) {

		if (r == 1 && c == 1) {
			System.out.println(p);
			return;
		}
		if (c >= 1)
			mazeSolverDiagonal(p + "R", r, c - 1);
		if (r >= 1)
			mazeSolverDiagonal(p + "D", r - 1, c);
		if (r >= 1 && c >= 1)
			mazeSolverDiagonal(p + "d", r - 1, c - 1);
	}

	public static ArrayList<String> mazeSolverDiagonalReturn(String p, int r, int c) {

		if (r == 1 && c == 1) {
			// System.out.println(p);
			ArrayList<String> l = new ArrayList<>();
			l.add(p);
			return l;
		}
		ArrayList<String> local = new ArrayList<>();
		if (c >= 1) {
			local.addAll(mazeSolverDiagonalReturn(p + "R", r, c - 1));
		}
		if (r >= 1) {
			local.addAll(mazeSolverDiagonalReturn(p + "D", r - 1, c));

		}
		if (r >= 1 && c >= 1) {
			local.addAll(mazeSolverDiagonalReturn(p + "d", r - 1, c - 1));
		}

		return local;
	}

	public static void mazeSolverLRUD(String p, int r, int c, boolean[][] arr) {

		if (r == 1 && c == 1) {
			System.out.println(p);
			printMatrix(arr);
			return;
		}
		if (c > 0 && checkIfFalse(arr, r, c)) {
			arr[r][c] = true;
			mazeSolverLRUD(p + "R", r, c - 1, arr);
			arr[r][c] = false;

		}
		if (r > 0 && checkIfFalse(arr, r, c)) {
			arr[r][c] = true;
			mazeSolverLRUD(p + "D", r - 1, c, arr);
			arr[r][c] = false;
		}
		if (r < arr.length-1 && checkIfFalse(arr, r, c)) {
			arr[r][c] = true;
			mazeSolverLRUD(p + "U", r + 1, c, arr);
			arr[r][c] = false;
		}
		if (c < arr[0].length -1&& checkIfFalse(arr, r, c)) {
			arr[r][c] = true;
			mazeSolverLRUD(p + "L", r , c+1, arr);
			arr[r][c] = false;
		}

	}

	private static boolean checkIfFalse(boolean[][] arr, int r, int c) {
		if (arr[r][c] == true)
			return false;
		return true;
	}

	private static void printMatrix(boolean[][] arr) {
		// TODO Auto-generated method stub
		for (boolean[] a : arr) {
			for (boolean bs : a) {
				System.out.print(bs + " ");

			}
			System.out.println();

		}

	}
}
