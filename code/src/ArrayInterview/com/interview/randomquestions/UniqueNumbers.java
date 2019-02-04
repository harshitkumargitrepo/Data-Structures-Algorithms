package com.interview.randomquestions;

public class UniqueNumbers {
	/**
	 * An Array arr={7, 7, 8, 8, 9, 1, 1, 4, 2, 2} has numbers appearing twice or once. 
	 * Duplicates appear side by side every time. 
	 * Might be few numbers can be occur one time and just assume this is a right rotating array 
	 * (just say an array can rotate k times towards right). 
	 * Aim is to identify numbers that occured once in array. 
	 *
	 *
	 */

	public static void main(String[] args) {

		int arr[] = {7, 7, 8, 8, 9, 1, 1, 4, 2, 2};
		//int arr[] = {7, 8, 8, 9, 1, 1, 4, 2, 7};
		//int arr[] = { 1, 7, 8, 8, 9, 1, 1, 4, 2, 3 };
		//int arr[] = {2,3,3};

		int i=1; 
		int n=arr.length;
		if(arr[0]==arr[n-1]){ 
			i=2; 
		} 
		else if(arr[n-1]!=arr[n-2]){	
			System.out.println(arr[n-1]);
		}

		// Check the consecutive two numbers
		// 1. if both equal, they are duplicate pairs. Move on to next set
		// 2. if not equal, the first number identified is unique
		for(int item : arr) { 	System.out.print(" "+item); 	}
		System.out.println();
		while(i<n){
			System.out.println("Comparing "+arr[i-1] + " and "+ arr[i]);
			if(arr[i-1] == arr[i]){
				i=i+2;
			} 
			else
			{ 
				System.out.println("Found unique " + arr[i-1]);
				i++;
			} 
		}
	} 


}
