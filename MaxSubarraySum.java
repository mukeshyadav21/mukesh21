package com.mk.sageit.coding;

public class MaxSubarraySum {

		 public static int maxSubarraySum(int[] ar) {
		        int n = ar.length;
		        int maxSum = Integer.MIN_VALUE;

		        for (int i = 0; i <= n - 1; i++) {
		            int Sum = 0;
		            for (int j = i; j <= n - 1; j++) {
		            Sum =Sum + ar[j];
		            if (Sum > maxSum) {
		                maxSum = Sum;
		            }
		        }
		    }
				return maxSum;
	}
		 public static void main(String[] args) {
			int [] a= {-5,-7,-9,1, 2, 3, 4};
			System.out.println(maxSubarraySum(a));
		}

}
