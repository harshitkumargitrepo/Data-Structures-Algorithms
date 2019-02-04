package com.interview.randomquestions;

import java.util.HashMap;

public class TwoSum {

	 public int[] twoSum(int[] nums, int target) {
	        if(nums == null || nums.length == 0) throw new IllegalStateException("Array empty");
	        int[] res = new int[2];
	        
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for(int i = 0; i < nums.length; i++){				/***** O(n) ******/
	            if(map.containsKey(target - nums[i])){
	                res[0] = map.get(target - nums[i])  ;
	                res[1] = i;
	            }else{
	                map.put(nums[i], i);
	            }
	        }
	        return res;
	 }
	 
		public static void main(String[] args) {
			TwoSum controller = new TwoSum();
			int[] nums = {1,2,3,4,5,6,7};
			int target = 7;
			int[] res = controller.twoSum(nums,target);
			System.out.println("target :"+target+ " is made up sum of first number: "+nums[res[0]]+" and second number: "+nums[res[1]]);
		}
}
