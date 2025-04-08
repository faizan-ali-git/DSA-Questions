package com.example.test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

//	public static int i;
//	
//	public static void  fun() {
//		System.out.println("In static method");
//	}
//	public  void  fun2() {
//		System.out.println("In instance method");
//	}
//	public Practice(){
//		System.out.println("In constructor");
//	}
//	static {
//		i = 9;
//		try {
//			System.out.println(i / 0);
//		} catch (Exception e) {
//			System.out.println("In static block2");
//		}
//	}
//	
//	static {
//		i = 9;
//		try {
//			System.out.println(i / 0);
//		} catch (Exception e) {
//			System.out.println("In static block");
//		}
//	}
//	
//	{
//		i = 9;
//		try {
//			System.out.println(i / 0);
//		} catch (Exception e) {
//			System.out.println("In instance block");
//		}
//	}
//	{
//		i = 9;
//		try {
//			System.out.println(i / 0);
//		} catch (Exception e) {
//			System.out.println("In instance block2");
//		}
//	}

	// Method 1
	public static void main(String[] args) {

		String[] s = new String[] {""};
		String s1 = "abcd";
		String t = "acbd";
		

		int[] arr= new int[] {1,12,-5,-6,50,3};
		int k =4;
		System.out.println(findMaxAverage(arr,k));
	}
	
	 public static double findMaxAverage(int[] nums, int k) {
	        
	        int sum =0;
	        for(int i=0 ; i<k ;i++){
	                sum += nums[i];
	        }

	        double ans =sum /k;
	        int i=0 ,j=k;
	        while(j<nums.length){
	            sum= sum-nums[i] +nums[j];
	            i++; j++;
	            double m= (double)sum/k;
	            ans = Math.max(ans,m);

	        }

	        return ans;
	    }
	 public static boolean areRotations(String s1, String s2) {

	        int rotateCount = s1.length() -1;
	        int i=0;
	        StringBuilder s1b= new StringBuilder(s1);
	        while(i<=rotateCount){
	            char temp =s1b.charAt(s1b.length()-1);
	            
	            for(int j=s1b.length()-2 ;j>=0 ; j-- ){//rotate
	                s1b.setCharAt(j+1,s1b.charAt(j));
	            }
	            s1b.setCharAt(0,temp);
	            //one rotation finished
	            if(s1b.toString().equals(s2)){
	                return true;
	            }
	            i++;
	        }
	        return false;
	    }
	  static ArrayList<Integer> search(String txt, String pat) {
	        
	        ArrayList<Integer> list = new ArrayList<>();
	        int index=0,j=0,i=0;
	        while(i<txt.length()) {
	            
			    if(j==pat.length()){
			        j=0;
			        list.add(i-pat.length());
			    }
			    
			    if(txt.charAt(i)==pat.charAt(j)){
			        i++;j++;
			    } else {
			    	if(index==0)
			    		i++;
			    	else
			    		i= index+1;
			        j=0;
			    }
			}
			
			if(j==pat.length()){
			        list.add(i-pat.length());
			   }
			
			return list;
			
	    }
	public static String addBinary(String s1, String s2) {
        // code here
        int carry =0;
        int n1 = s1.length() , n2= s2.length();
        int i=n1-1,j= n2-1;
        StringBuilder str= new StringBuilder();
        int sum=0;
        while(i>=0 && j>=0){
            sum = (s1.charAt(i)- '0')+ (s2.charAt(j)- '0' )+ carry;
            if(sum==0){
                str.append('0');
                carry=0;
            } else if(sum==1){
                str.append('1');
                carry =0;
            } else if(sum==2){
                str.append('0');
                carry=1;
            }else if(sum==3){
                str.append('1');
                carry=1;
            }
            i--;j--;
        }
        
         while(i>=0 ){
            sum = (s1.charAt(i)- '0') + carry;
             if(sum==0){
                str.append(0);
                carry=0;
            } else if(sum==1){
                str.append(1);
                carry =0;
            } else if(sum==2){
                str.append(0);
                carry=1;
            }else if(sum==3){
                str.append('1');
                carry=1;
            }
             i--;
         }
         
         while(j>=0 ){
            sum = (s2.charAt(j)- '0') + carry;
             if(sum==0){
                str.append(0);
                carry=0;
            } else if(sum==1){
                str.append(1);
                carry =0;
            } else if(sum==2){
                str.append(0);
                carry=1;
            }else if(sum==3){
                str.append('1');
                carry=1;
            }
             j--;
         }
         //add carry if left in last
         if(carry==1) {
        	 str.append(1);
         }
         
        String trimmed = str.reverse().toString();
        trimmed= trimmed.toString().replaceAll("^0+","");
    return trimmed;
    }
	static void   nextPermutation(int[] arr) {
	        
	        //1.iterate till the array is strictly incrementing
	        //2. from that index to end find the index that is just
	        //larger then index-value(index+1 to n-1)
	        //swapp index with that ind
	        // sort the array from index+1 to n-1 in inc. order
	        int i=0, n= arr.length;
	        while(i<n-1){
	            if(arr[i] > arr[i+1]){
	                break;
	            }
	            i++;
	        }
	        //if i goes to last that means it's strictly asc. till end
	        //so no next permutation is possible- no need to do anything -so returning
	        if(i==n-1){
	       //     Arrays.sort(arr,0,n-1); //sort in  dec order
	            return ;
	        }
	        int index = i+1;
	        int justGreterInd =-1,justGreater= arr[index];
	        for(i = index+1  ; i<n-1 ;i++){
	            if(arr[i] >arr[index] && arr[i] <justGreater){
	                justGreterInd =i;
	                justGreater =arr[i];
	            }
	        }
	        if(justGreterInd ==-1){
	            //sort the array in inc.order
	             Arrays.sort(arr);
	             return ;
	        }
	    //    swap(arr,justGreterInd ,index);
	        int temp= arr[justGreterInd];
	        arr[justGreterInd] = arr[index];
	        arr[index] = temp;
	        
	        Arrays.sort(arr,index+1,n-1);
	        
	        
	    }
	 static void rotateArr(int arr[], int d) {
	        int n= arr.length;
	        int temp[] = new int[n];
	        
	        int index =0;
	        for(int i=d ;i<n ;i++){
	            temp[index++]=arr[i];
	        }
	        
	         for(int i=0 ;i<d ;i++){
	             temp[index++]=arr[i];
	         }
	         
	         for(int i=0 ;i<n ;i++){
	             arr[i]=temp[i];
	         }
	        
	    }
public static int getSecondLargest(int[] arr) {
        
        int max =Integer.MIN_VALUE,secondMax =-1;
        
        for(int i=0 ;i<arr.length ;i++){
            
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            
            if(arr[i]> secondMax && arr[i]< max){
                secondMax= arr[i];
            }
        }       
       
    return secondMax;
    }
	public static int trap(int[] height) {
        int res= 0,n=height.length;
        int[] lM=new int[n];
        int[] rM= new int[n];
        //calculating the leftMax and rightMax for each index Note:inclusive(means including the index)
        lM[0] =height[0];
        rM[n-1] =height[n-1];
        for(int i=1 ;i<height.length ;i++){
               lM [i]= Math.max(height[i],lM[i-1]); 
               rM[n-i-1] = Math.max(height[n-i-1],rM[n-i]); // n-i-1 :second last index ,n-i: last index
        }
        // lR[n-1] =height[n-1];
        // for(int i=1 ;i<height.length ;i++){
        //        lM = Math.max(lM[i],lM[i-1]); 
        // }
        for(int i=0; i<n ;i++){
            res += Math.min(lM[i],rM[i]) - height[i];
        }

    return res;
    }
	 public static String longestCommonPrefix(String[] strs) {
	        
	        StringBuilder res= new StringBuilder();
	        boolean isMatchNotFound =false;
	        if(strs.length ==0){
	            return "";
	        }
	        //getting smallest string in the strs
	        int minLen = Integer.MAX_VALUE;
	        for(int i=0 ;i<strs.length ; i++){
	            if(minLen >strs[i].length()){
	                minLen = strs[i].length();
	            }
	        }

	        for(int i=0 ; i<minLen ;i++){//iterating over the indexes
	          for(int j=0 ;j<strs.length-1;j++){ //iterating over the strings
	                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
	                    isMatchNotFound =true;
	                    break;
	                }
//	                else{ //was adding the char for each string in the array
//	                    res.append(strs[j].charAt(i));
//	                }
	            }
	            if(isMatchNotFound)
	                break;
	            else {
	            	res.append(strs[0].charAt(i));
	            }
	        }
	        return res.toString();
	    }
	public static boolean isPalindrome(String s) {
        int l=0 ,r=s.length()-1;

        while(l<r){
            while(!isAlphaNumeric(s.charAt(l))){
                l++;
            }

             while(!isAlphaNumeric(s.charAt(r))){
                r--;
            }
            char lowerL = (s.charAt(l) <=90 && s.charAt(l) >=65) ? Character.toLowerCase(s.charAt(l)) : s.charAt(l) ;
            char lowerR = (s.charAt(r) <=90 && s.charAt(r) >=65) ? Character.toLowerCase(s.charAt(r)) : s.charAt(r) ;
            if(lowerL != lowerR || (l>r)){ // wrong here with (l>=r) because if last character is not paired it means that it is
            								//still a valid palindrome
                return false;
            }
            l++; r--; //forgot this also
        }
        return true;
    }

    public static boolean isAlphaNumeric(char ch){
        if((ch <=122 && ch >=97) || (ch <=90 && ch >=65) || (ch <=57 && ch >=48)){
            return true;
        } else{
            return false;
        }
    }
    
    
	public static String minWindow(String s, String t) {
	       int l=0,r=0,minLen=Integer.MAX_VALUE;
	       int m=s.length(),n= t.length(),resInd =-1,count=0;
	       Map<Character,Integer> map = new HashMap<>();

	        for(char c : t.toCharArray()){
	            map.put(c,map.getOrDefault(c,0)+1);
	        }
	        while(r<m){
	            if(!map.containsKey(s.charAt(r))){
	                map.put(s.charAt(r),-1);
	            }
	            else if(map.get(s.charAt(r)) >0){ //we found one character
	                count++;
	                map.put(s.charAt(r), map.get(s.charAt(r)) -1 );
	                while(count ==n){ // we found a possible substring
	                //    minLen=Math.min(minLen, r-l+1); // wrong here - update resIns only when
	                 //   resInd=l;						// we find smaller minLen then previous
	                	if(minLen> r-l+1) {
	                    	minLen = r-l+1;
		                    resInd=l;
	                    }
	                    map.put(s.charAt(l), map.get(s.charAt(l)) +1 );
	                    if(map.get(s.charAt(l)) >0){
	                        count--;

	                    }
	                    l++;
	                }
	            } else {
	                map.put(s.charAt(r), map.get(s.charAt(r)) -1 );	                	
	            }
	            r++;
	        }

	        if(resInd ==-1)
	            return "";
	        else
	            return s.substring(resInd,resInd+minLen);
	    }

	int search(int[] arr, int key) {
		// Complete this function

		// Double Binary search (using pivot)
		int pivot = findPivot(arr);
		int n = arr.length, res;
		if (key == arr[pivot]) {
			return pivot;
		}
		if (pivot == 0)
			return binarySearch(arr, 0, n - 1, key);

		if (arr[0] > key) {
			res = binarySearch(arr, pivot + 1, n - 1, key);
		} else {
			res = binarySearch(arr, 0, pivot - 1, key);

		}
		return res;

	}

	int findPivot(int[] arr) {
		int low = 0, high = arr.length - 1;

		while (low < high) {
			if (arr[low] <= arr[high]) {
				return low; // found pivot
			}
			int mid = (low + high) / 2;

			if (arr[mid] > arr[high]) {
				low = mid + 1;
			} else {
				high = mid;
			}

		}
		return low;
	}

	int binarySearch(int arr[], int low, int high, int key) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}

	public static boolean hasTripletSum(int arr[], int target) {

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {

			int l = i + 1, r = arr.length - 1;

			while (l < r) {
				int current_sum = arr[i] + arr[l] + arr[r];
				if (current_sum == target) {
					return true;
				}
				if (current_sum < target) {
					l++;
				} else {
					r--;
				}
			}
		}

		return false;
	}

	static int maxProduct(int[] arr) {

		int preProd = 1, postProd = 1, maxProd = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (preProd == 0)
				preProd = 1;

			if (postProd == 0)
				postProd = 1;

			preProd = preProd * arr[i];
			postProd = postProd * arr[arr.length - 1 - i];

			maxProd = Math.max(maxProd, Math.max(preProd, postProd));
		}

		return maxProd;
	}

	public static int longestConsecutive(int[] nums) {

		int cons = 0, maxCons = 1;
		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return cons;
		}
		int lastSmaller = Integer.MIN_VALUE;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if (lastSmaller == nums[i] - 1) {
				cons++;
				lastSmaller = nums[i];
			} else if (lastSmaller != nums[i]) { // other element
				cons = 1;
				lastSmaller = nums[i];
			}
		}
		maxCons = Math.max(cons, maxCons);

		return maxCons;
	}

	public static int[] removeDuplicates(int[] arr) {

		int pos = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[pos] != arr[i]) {
				pos++;
				arr[pos] = arr[i];
			}
		}
		int[] res = new int[pos + 1];
		for (int i = 0; i < pos + 1; i++) {
			res[i] = arr[i];
		}

		return res;
	}

	public static int removeDuplicates(List<Integer> list) {

		int pos = 0;

		for (int i = 1; i < list.size(); i++) {
			if (list.get(pos) != list.get(i)) {
				pos++;

			}
		}

		return pos + 1;
	}

//		
//		
//		
//		
//		
//	}
	public static int lengthOfLongestSubstring(String s) {

		int len = 0, maxLen = Integer.MIN_VALUE;
		Set<Character> set = new HashSet<>();
		Map<Character, Integer> map = new HashMap<>();
		if (s.length() == 0) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}

		// for(int i=0 ;i<s.length() ;i++){
		// if(set.contains(s.charAt(i))){
		// maxLen=Math.max(maxLen,set.size());
		// set.clear();
		// set.add(s.charAt(i));//we have to consider the current character also
		// } else{
		// set.add(s.charAt(i));
		// maxLen=Math.max(maxLen,set.size());
		// }
		// }

		int l = 0;
		for (int r = 0; r < s.length(); r++) {
			if (!map.containsKey(s.charAt(r)) || (!(map.get(s.charAt(r)) <= r && map.get(s.charAt(r)) >= l))) {
				map.put(s.charAt(r), r);
				maxLen = Math.max(maxLen, r - l + 1);
			} else {
				l = map.get(s.charAt(r)) + 1;
				map.put(s.charAt(r), r);
				maxLen = Math.max(maxLen, r - l + 1);

			}
		}
		return maxLen;
	}

	public void setZeroes(int[][] matrix) {
		Set<Integer> setI = new HashSet<Integer>();
		Set<Integer> setJ = new HashSet<Integer>();
		int m = matrix.length;
		int n = matrix[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					setI.add(i);
					setJ.add(j);
				}
			}
		}

		for (int i : setI) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = 0;
			}
		}

		for (int j : setJ) {
			for (int i = 0; i < m; i++) {
				matrix[i][j] = 0;
			}
		}

	}

	public static Integer binarySearch(int[] arr, int element) {

		int start = 0, end = arr.length;
		Arrays.sort(arr);

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] > element) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return -1;
	}

	void mergeSort(int arr[], int l, int r) {

		if (l < r) {

			int mid = (l + r) / 2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			merge(arr, l, r, mid);

		}

	}

	void merge(int arr[], int l, int r, int mid) {

		// int n1= l+mid+1;
		int n1 = mid - l + 1;
		int n2 = r - mid;

		int[] left = new int[n1];
		int[] right = new int[n2];

		for (int i = 0; i < n1; i++) {
			left[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid + j + 1];
		}
		int i = 0, j = 0;

		int k = l;

		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];

			}
		}

		while (i < n1) {
			arr[k++] = left[i++];

		}
		while (j < n2) {
			arr[k++] = right[j++];

		}
	}

	public int maximumProfit(int prices[]) {
		// Code here
		int maxProfit = 0;

		// Brute force
		for (int i = 0; i < prices.length; i++) {// O(N2) didn't ran for all test cases
			// because of timeout issue
			for (int j = i + 1; j < prices.length; j++) {
				maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
			}
		}

		return maxProfit;
	}

}
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

// Subclass that follows LSP
class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }
}

// Subclass that violates LSP
class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches cannot fly");
    }
}

//************************************

//*********************************************************

//*************************************************

//**********************************************************************
//
//	Character[] arr = new Character[s.length()];
//
//	for (int i = 0; i < s.length(); i++) {
//		arr[i] = s.charAt(i);
//	}
//
//	Comparator<Character> com = new Comparator<Character>() {
//
//		@Override
//		public int compare(Character o1, Character o2) {
//			// TODO Auto-generated method stub
//			char c1=Character.toLowerCase(o1.charValue()) ;
//			char c2=Character.toLowerCase(o2.charValue()) ;
//			return c1- c2;
//		}
//	};
//
//	// l.sort(com);
//	Arrays.sort(arr, (o1,  o2) ->  Character.toLowerCase(o1.charValue()) - Character.toLowerCase(o2.charValue()));
//	
//	StringBuilder sb = new StringBuilder(arr.length);
//
//	for (Character c : arr)
//		sb.append(c.charValue());
//	
//	
//	System.out.println(sb);