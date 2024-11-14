package com.example.pattern;

public class Patterns {

	public static void main(String[] args) {

		pattern9(4);
	}

	public static void pattern1(int n) {

//		*
//		* *
//		* * *
//		* * * *

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {

//		* * * *
//		* * * *
//		* * * *
//		* * * *

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {

//	* * * *
//	* * *
//	* * 
//	* 

		for (int row = 1; row <= n; row++) {
			// for(int col=n-row +1 ;col>= 1; col--) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {

//		1
//		1 2 
//		1 2 3
//		1 2 3 4

		for (int row = 1; row <= n; row++) {
			// for(int col=n-row +1 ;col>= 1; col--) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	public static void pattern5(int n) {
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *		
//		* * * *
//		* * *
//		* * 
//		* 

//		for(int row=1 ;row<=n ;row++) {
//			//for(int col=n-row +1 ;col>= 1; col--) {
//				for(int col=1 ;col<= row; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int row=1 ;row<n ;row++) {
//			//for(int col=n-row +1 ;col>= 1; col--) {
//				for(int col=1 ;col<= n-row ; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();

		// OR
//			for(int row=1 ;row<2*n ;row++) {
//				
//				if(row<=n) {
//					for(int col=1;col<=row ;col++) {
//						System.out.print("* ");
//					}
//					System.out.println();
//				}
//				else {
//					for(int col=1;col<=(2*n)-row ;col++) {
//						System.out.print("* ");
//					}
//					
//					System.out.println();
//				}
//			
//		}
		// OR
		for (int row = 1; row < 2 * n; row++) {
			int totalColumns = row <= n ? row : (2 * n) - row;

			for (int col = 1; col <= totalColumns; col++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void pattern6(int n) {
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *		
//		* * * *
//		* * *
//		* * 
//		* 
		// Basically the above pattern is converted into below one by
		// adding some spaces in each row
//		 *
//      * *
//     * * *
//    * * * *
//   * * * * *		
//    * * * *
//     * * *
//      * * 
//       * 
		for (int row = 1; row < 2 * n; row++) {
			int totalStars = row <= n ? row : (2 * n) - row;
			int totalSpaces = n - totalStars;

			for (int col = 1; col <= totalSpaces; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= totalStars; col++) {
				System.out.print("* ");
			}

			System.out.println();

		}
	}

	public static void pattern7(int n) {
//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5 

		for (int row = 1; row <= n; row++) {
			int maxNum = row;
			int totalSpaces = n - row;

			for (int col = 1; col <= totalSpaces; col++) {
				System.out.print("  ");
			}
			for (int col = maxNum; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for (int col = 2; col <= maxNum; col++) {
				System.out.print(col + " ");
			}

			System.out.println();

		}

	}

	public static void pattern8(int n) {
//       1
//      212
//     32123
//      212
//       1 

		for (int row = 1; row < 2 * n; row++) {
			int maxNum = row <= n ? row : 2*n-row;
			int totalSpaces = row <= n ? n - row : row - n;

			for (int col = 1; col <= totalSpaces; col++) {
				System.out.print(" ");
			}
			for (int col = maxNum; col >= 1; col--) {
				System.out.print(col);
			}
			for (int col = 2; col <= maxNum; col++) {
				System.out.print(col);
			}

			System.out.println();

		}

	}
	public static void pattern9(int n) {
//4 4 4 4 4 4 4 4 
//4 3 3 3 3 3 3 4 
//4 3 2 2 2 2 3 4 
//4 3 2 1 1 2 3 4 
//4 3 2 1 1 2 3 4 
//4 3 2 2 2 2 3 4 
//4 3 3 3 3 3 3 4 
//4 4 4 4 4 4 4 4 
//		
		for (int row = 0; row < (2 * n)-1 ; row++) {
		
			
			for (int col = 0; col < (2*n) -1; col++) {
				int minLength=n- Math.min(Math.min(col, row),Math.min((2*n)-1-col, (2*n)-1-row)) ;
				System.out.print(minLength+" ");
			}
			System.out.println();
			
			
			
		}
		
	}

}
