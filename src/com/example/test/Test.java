package com.example.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat=new int[9][2];
		int[][] mat2= {
				{2025,2041},
				{1988,2007},
				{2003,2046},
				{2045,2049},
				{2025,2027},
				{2014,2040},
				{2014,2027},
				{2011,2027},
				{1972,2019},
				
		};
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "	");
			}
			System.out.println();
		}
		System.out.println("-------------------");
	//	transpose(mat);
		System.out.println("-------------------");
System.out.println(maximumPopulation(mat2));
		
	}
//	 public static int[][] transpose(int[][] matrix) {
//	        
//		 
//	        int m=matrix.length,n=matrix[0].length,swap;
//	        int[][] matr=new int[5][4];
//	      //  System.out.println(n);
//	        for(int i=0 ;i<m ;i++){
//	            for(int j=0 ;j<n ;j++){
////	                swap=matrix[i][j];
////	                matrix[i][j]=matrix[j][i];
////	                matrix[j][i]=swap;
//	            	matr[j][i]=matrix[i][j];
//	            }
//	        }
//	        for (int i = 0; i < matr.length; i++) {
//				for (int j = 0; j < matr[i].length; j++) {
//					System.out.print(matr[i][j] + "	");
//				}
//				System.out.println();
//			}
//	        return matr;
//	 }
	 public static int maximumPopulation(int[][] logs) {
	        
	        int syear=Integer.MAX_VALUE,lyear=Integer.MIN_VALUE,n=logs.length,ansc=0,ansy=0;
	        for(int i=0 ;i<n ;i++ ){
	            
	            syear=Math.min(syear,logs[i][0]);
	            lyear=Math.max(lyear,logs[i][1]);
	        }
	        System.out.print(syear + "	"+lyear);
	        for(int i=syear ;i<lyear ;i++){
	            int count=0;
	         //   System.out.println(i);
	            for(int j=0 ;j<n ;j++ ){
	                if(i>=logs[j][0] && i<logs[j][1]){
	                    count++;
	                    
	                }
	            }
	            if(count>ansc){
	                ansc=count;
	                ansy=i;
	               // System.out.println(ansy);

	            }
	            
	        }
	        return ansy;
	    }
}
