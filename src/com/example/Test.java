package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static int COUNT = 0;

	public static void main(String[] args) {
		// System.out.println(getBinary(1,2));
		// System.out.println(0%2);
		int[] nums = { 1,1,1,2,2,3 };
		int m = 3, n = 2;
		// System.out.println(findDuplicate(nums));
		// System.out.println(uniquePaths(m, n, 0));
		// uniquePathsVoid(2, 6);
		// int[][] dp = new int[m][n];
		// Arrays.fill(dp, -1);
		 System.out.println(removeDuplicates(nums));
		 System.out.println(Arrays.toString(nums));
		// sortColors(nums);
		//System.out.println(Arrays.toString(smallerNumbersThanCurrent2(nums)));

		// nextPermutation(nums);
		// System.out.println(Arrays.toString(nums));
		// System.out.println(Arrays.toString(cl.toArray()));
		//int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		//System.out.println(minSubArrayLen(7, nums));

		// System.out.println(longestConsecutive(nums));
//		for(int[] a:merge(intervals)) {
//			System.out.println(Arrays.toString(a));
//		}

	}
	public static int removeDuplicates(int[] nums) {
        int count=1,resCount=0,i=1,n=nums.length;

		 while(i<n) {
			 if(nums[i]==nums[i-1]) {
                 count++;
				 if(count>2) {					
                    leftShift(nums,i);
                    n--;
					 resCount++;
				 } else{
                    i++;
                 }
				
			 }else {				
				 count=1;
                 i++;
			 }
		 }
		return nums.length- resCount;
    }
    public static void leftShift(int[] nums,int index) {
		 for(int i=index ; i<nums.length-1 ;i++){
            nums[i]=nums[i+1];
         }
	 }
	public static int[] smallerNumbersThanCurrent2(int[] nums) {
	       // int[] ans = new int[nums.length];
			// int count = 0;
			// for (int i = 0; i < nums.length; i++) {
			// 	count = 0;
			// 	for (int j = 0; j < nums.length; j++) {
			// 		if (nums[i] > nums[j]) {
			// 			count++;
			// 		}
			// 		ans[i] = count;
			// 	}
			// }
			// return ans;

	        int[] arr =new int[101];
	        int count=0,val;
	        for(int i=0 ;i<nums.length ;i++){
	            arr[nums[i]]++;
	        }
	        for(int i=0 ;i<101 ;i++){
	            if(arr[i]!=0){
	            	val=arr[i];
	                arr[i]=count;
	                count+=val;
	            }
	        }
	        for(int i=0 ;i<nums.length ;i++){
	            nums[i]=arr[nums[i]];
	        }

	        return nums;
	    }

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] ans = new int[nums.length];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					count++;
				}
				ans[i] = count;
			}
		}
		return ans;

	}

	public static int minSubArrayLen(int target, int[] nums) {
		int i = 0, len = 0, ansLen = Integer.MAX_VALUE, sum = 0, ind = 0;
		while (i <= nums.length && ind < nums.length) {
			// while(ind<nums.length) {
			if (i < nums.length && sum < target) {
				sum += nums[i];
				i++;
				len++;
			} else if (ind < nums.length || sum >= target) {
				ansLen = Math.min(ansLen, len);
				sum -= nums[ind];
				len--;
				ind++;
			}
		}

		return ansLen;

	}

	public static int removeElement(int[] nums, int val) {
		int k = 0, index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index] = nums[i];
				index++;
			} else {
				k++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return k;
	}

	public static int longestConsecutive(int[] nums) {
		int cnt = 1, maxCon = Integer.MIN_VALUE;// Better APproach by me
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == (nums[i + 1] - 1)) {
				cnt++;
			} else {
				maxCon = Math.max(maxCon, cnt);
				cnt = 1;
			}
		}
		maxCon = Math.max(maxCon, cnt);
		return maxCon;
	}

	public static int[][] merge(int[][] intervals) {
		// bruteforce by me
//        int m=intervals.length;
//		int n = 2, lI = -1, rI = -1/* ,i=0 */;
//       // int[][] res= new int[m][2];
//        List<List<Integer>> twoDimlist=new ArrayList<>();
//    //	List<Integer> list= new ArrayList<>();
//        for(int[] a: intervals){
//            if(lI==-1 && rI==-1){
//                lI=a[0];rI=a[1];
//            }
//            else if(lI<=a[0] && rI>=a[1]){
//                continue;
//            }
//            else if(rI<a[0] || lI>a[1]){
//                //res[i][0]=lI; res[i][1]=rI;
//               // i++;
//            	List<Integer> list= new ArrayList<>();
//            	list.add(lI);list.add(rI);
//            	twoDimlist.add(list);
//            	//list.clear();
//                lI=a[0];rI=a[1];
//            }
//            else if(lI<=a[0] && rI>=a[0] &&a[1]>rI){
//                rI=a[1];
//            }
//             else if(lI<=a[1] && rI>=a[1] &&a[0]<lI){
//                rI=a[1];
//            }
//            else if(lI>a[0] && rI<a[1]){
//                lI=a[0];rI=a[1];
//            }
//        }
//       // res[i][0]=lI;res[i][1]=rI;
//    	List<Integer> list= new ArrayList<>();
//    	list.add(lI);list.add(rI);
//    	twoDimlist.add(list);
//    	
//    	 int[][] twoDArray = twoDimlist.stream().map(x -> x.stream().mapToInt(i->i).toArray()).toArray(int[][]::new);
//        return twoDArray;
		int n = intervals.length;
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		for (int i = 0; i < n; i++) {
			int start = intervals[i][0];
			int end = intervals[i][1];

			if (ans.isEmpty() || ans.get(ans.size() - 1).get(1) < start) {
				ans.add(Arrays.asList(start, end));
			} else {
				for (int j = i + 1; j < n; j++) {
					ans.get(ans.size() - 1).set(1, Math.max(end, ans.get(ans.size() - 1).get(1)));
				}
			}
		}
		int[][] twoDArray = ans.stream().map(x -> x.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
		return twoDArray;

	}

	public static void nextPermutation(int[] nums) {
		// Optimal from striver
		int ind = -1, n = nums.length, swap;
		for (int i = n - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				ind = i;
				break;
			}
		}
		if (ind == -1) {
			// reverse entire array
			for (int i = 0; i < n / 2; i++) {
				int temp = nums[i];
				nums[i] = nums[n - 1 - i];
				nums[n - 1 - i] = temp;
			}
			return; // did mistake here forgot this return line, because
			// below code will execute and might send outOfBound Exception
		}
		// else breakPoint is there
		for (int i = n - 1; i > ind; i--) {
			if (nums[i] > nums[ind]) {
				swap = nums[i];
				nums[i] = nums[ind];
				nums[ind] = swap;
				break;
			}
		}

		// reverse from ind+1 to end
		for (int i = ind + 1; i < (n - ind + 1) / 2; i++) {
			swap = nums[i];
			nums[i] = nums[n - i + ind];
			nums[n - i + ind] = swap;
		}

	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ansL = new ArrayList<>();
		int temp;
		for (int i = 1; i <= numRows; i++) {
			temp = 1;
			List<Integer> tempL = new ArrayList<>();
			tempL.add(temp);
			// temp=1;
			for (int j = 1; j < i; j++) {
				temp = temp * (i - j) / j;
				tempL.add(temp);
			}
			ansL.add(tempL);
		}
		return ansL;
	}
//	        List<Integer> cl=new ArrayList<>();
//	        
//	        List<List<Integer>> bigList=new ArrayList<>();
//	       
//	        bigList.add(Arrays.asList(1));
//	        if(numRows==1){
//	            return bigList;
//	        }
//	        cl.add(1);
//	        cl.add(1);
//	        bigList.add(cl);
//	        if(numRows==2){
//	             return bigList;
//	        }
//	        else{
//	            for(int i=0 ;i<numRows-2 ;i++){
//	            List<Integer> rl=new ArrayList<>();
//	                rl.add(1);
//	                    for(int j=0 ; j<cl.size()-1 ;j++){
//	                        rl.add(cl.get(j) + cl.get(j+1));
//	                    }
//	                 rl.add(1);
//	                 bigList.add(rl);
//	                 cl=rl;
//	            }
//	            return bigList;
//	        }

	public static void sortColors(int[] nums) {
//	        int[] arr=new int[3];//worked
//	        int k=0,j=0;
//	        for(int i=0 ;i<nums.length ;i++){
//	            arr[nums[i]]++;
//	        }
//	        while(j<3 ){
//	            if(arr[j]>0)
//	            for(int i=0 ;i<arr[j]; i++){
//	                nums[k++]=j;
//	            }
//	            j++;
//	        }
		// -------------------Dutch National flag algorithm
		int n = nums.length;
		int low = 0, mid = 0, high = n - 1, swap;
		while (mid <= high) {
			if (nums[mid] == 0) {
				swap(nums, low, mid);
				low++;
				mid++;
			} else if (nums[mid] == 1) {// Remeber when I used all 3 if statements it failed
				// because it was executing more then one condition for an elemnt because of the
				// swapping

				mid++;
			} else {
				swap(nums, mid, high);
				high--;
			}
		}

	}

	public static int uniquePathsDynamic(int m, int n, int paths, int[][] dp) {

		int p1 = 0, p2 = 0;
		if (m == 1 && n == 1) {
			paths++;
			// dp[m-1][n-1] ++;
			// System.out.println(paths);
			return paths;

		}
		if (dp[m - 1][n - 1] != 0) {
			return dp[m - 1][n - 1];
		}
		if (m > 1) {
			p1 = uniquePathsDynamic(m - 1, n, paths, dp);

		}
		if (n > 1) {
			p2 = uniquePathsDynamic(m, n - 1, paths, dp);

		}
		dp[m - 1][n - 1] = p1 + p2;
		return (p1 + p2);
	}

	public static int uniquePaths(int m, int n, int paths) {

		int p1 = 0, p2 = 0;
		if (m == 1 && n == 1) {
			paths++;
			// System.out.println(paths);
			return paths;

		}
		if (m > 1) {
			p1 = uniquePaths(m - 1, n, paths);
		}
		if (n > 1) {
			p2 = uniquePaths(m, n - 1, paths);
		}
		return (p1 + p2);
	}

	public static void uniquePathsVoid(int m, int n) {

		// int p1=0,p2=0;
		if (m == 0 && n == 0) {
			COUNT++;
			System.out.println("path found" + COUNT);
			// return paths;
			return;
		}
		if (m > 0) {
			uniquePathsVoid(m - 1, n);
		}
		if (n > 0) {
			uniquePathsVoid(m, n - 1);
		}

	}

	public static int findDuplicate(int[] nums) {
		int i = 0;
		while (i < nums.length) {

			int correct = nums[i] - 1;

			if (nums[i] != nums[correct]) {
				swap(nums, i, correct);
			}
//			
//			if (nums[i] != (i+1)) {
//				swap(nums, i, nums[i] - 1);
//			}
			else
				i++;
		}
//		for (int j = 0; j < nums.length; j++) {
//			if (nums[j] != j + 1)
//				return nums[j];
//		}
		return nums[(nums.length) - 1];
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static int maxProfit(int[] prices) {
		int n = prices.length;
		int min = Integer.MAX_VALUE, maxPro = 0;

		for (int i = 0; i < n; i++) {

			min = Math.min(min, prices[i]);
			maxPro = Math.max(maxPro, prices[i] - min);

		}
		return maxPro;

//        int n=prices.length;
//       
//        int i=0, j=n-1,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
//        while(i<=j){
//        	
//            if(prices[i] <min || prices[j]>max){
//            	if(prices[i] <min){
//                min=prices[i];
//                i++;
//               
//            }
//             if(prices[j]>max){
//                max=prices[j];
//                j--;
//               
//            }
//            }
//             else {
//            	i++;//j--;
//            }
//        }
//        int maxDiff= max-min ;
//        if(maxDiff>0){
//            return maxDiff;
//        }
//        else
//        return 0;

	}

	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			// 4 cases over here
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static boolean check(int[] nums) {

		int s = 0, e = nums.length - 1, mid = -1;

		while (s < e) {
			mid = (s + e) / 2;
			if (nums[mid] > nums[mid + 1] && mid < e) {
				break;
			} else if (nums[mid] > nums[mid - 1] && mid > s) {

			} else if (nums[mid] < nums[mid + 1]) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		if (s < e || isA(nums)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isA(int[] nums) {
		boolean flag = true, temp;
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i + 1] < nums[i]) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static int getBinary(int b1, int b2) {

		int sum = 0, d = 1;
		while (b1 != 0 || b2 != 0) {

			if (((b1 % 2) == 0 && (b2 % 2) == 0) || ((b1 % 2) == 1 && (b2 % 2) == 1)) {
				sum = sum + (0 * d);
			} else {
				sum = sum + (1 * d);

			}
			// sum= sum + (temp*(b%2));
			d = d * 2;
			b1 = b1 / 2;
			b2 = b2 / 2;

		}
		return sum;
	}

}
