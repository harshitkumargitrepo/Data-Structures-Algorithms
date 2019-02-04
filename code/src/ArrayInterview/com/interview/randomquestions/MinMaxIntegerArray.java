package com.interview.randomquestions;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MinMaxIntegerArray {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

	public static void main(String[] args) {

		int array[] = {10,30000000,1,7,9,5,239,754,98,123,654,98,65,40,65,12,8000,10,30000000,12,79,90,875,29,54,998,17823,654,99898,65,40,68765,1762,8002};
		int min = array[0];
		int max = array[0];

		// Method 1 : Brute Force O(n)
		System.out.println("Method 1");
		Timestamp timestampStart = new Timestamp(System.currentTimeMillis());
		System.out.println("Start: "+timestampStart.getTime());

		for(int index=0; index<array.length;index++) {    	/***** O(N)  ******/

			if(array[index]>max) max = array[index]; 	/*** O(1) ***/
			if(array[index]<min) min = array[index]; 	/*** O(1) ***/
			System.out.println(" array["+index+"]="+array[index]+"  min ="+min+" max="+max);
		}

		Timestamp timestampEnd = new Timestamp(System.currentTimeMillis());
		System.out.println("\nStop: "+timestampEnd.getTime());

		System.out.println("Max : "+ max);
		System.out.println("Min : "+ min);
		System.out.println("Time taken : "+ (timestampEnd.getTime()-timestampStart.getTime()));


		// Method 2 : Brute Force O(n/2) - take two numbers at a time
		System.out.println("Method 2");
		min = array[0];
		max = array[0];


		timestampStart = new Timestamp(System.currentTimeMillis());
		System.out.println("Start: "+timestampStart.getTime());
		int index = 0;
		for(; index <array.length/2 ; index++) {	/***** O(N/2)  ******/

			int num1 = array[index*2];
			int num2 = array[(index*2)+1];

			if(num1>=num2) {									/*** O(1) ***/
				if(num1>max) max = num1;
				if(num2<min) min = num2;
			} else {
				if(num2>max) max = num2;
				if(num1<min) min = num1;
			}
			System.out.println("num1="+num1+" num2="+num2+"  min ="+min+" max="+max);			
		}

		if(index*2 < array.length) {
			int lastNumber = array[index*2];
			if(lastNumber>max) max = lastNumber;
			if(lastNumber<min) min = lastNumber;
		}

		timestampEnd = new Timestamp(System.currentTimeMillis());
		System.out.println("Stop: "+timestampEnd.getTime());

		System.out.println("Max : "+ max);
		System.out.println("Min : "+ min);
		System.out.println("Time taken : "+ (timestampEnd.getTime()-timestampStart.getTime()));

		// Method 3 : Divide and conquer method - Recursive method
		System.out.println("Method 3");
		timestampStart = new Timestamp(System.currentTimeMillis());
		System.out.println("Start: "+timestampStart.getTime());

		MinMax result = findMinMaxRecursive(array, 0, array.length - 1);
		System.out.println("max : " + result.max);
		System.out.println("min : " + result.min);

		timestampEnd = new Timestamp(System.currentTimeMillis());
		System.out.println("Stop: "+timestampEnd.getTime());

		System.out.println("Time taken : "+ (timestampEnd.getTime()-timestampStart.getTime()));

	}

	private static MinMax findMinMaxRecursive(int[] arr, int i, int j)
	{
		if (i > j)
			return null;
		if (i == j)
			return new MinMax(arr[i], arr[i]);
		else
		{
			MinMax left;
			MinMax right;
			left = findMinMaxRecursive(arr, i, (i + j) / 2);
			right = findMinMaxRecursive(arr, (i + j) / 2 + 1, j);
			if (left == null)
				return right;
			else if (right == null)
				return left;
			else
			{
				return new MinMax(Math.min(left.min, right.min), Math.max(
						left.max, right.max));
			}
		}
	}
}
	class MinMax
	{
		public int min;
		public int max;

		public MinMax(int min, int max)
		{
			this.min = min;
			this.max = max;
		}


	}
