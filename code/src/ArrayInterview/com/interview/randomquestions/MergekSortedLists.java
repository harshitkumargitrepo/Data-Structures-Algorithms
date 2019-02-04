package com.interview.randomquestions;

import java.util.Formatter;

public class MergekSortedLists {

	/************ 			Analysis of the question 			**************
	 * 1. the list of k sorted Lists are available as an array of LinkedList
	 * 2. Each sorted list is either ascending or descending order 
	 * 3. the resultant sorted list is required to be either fully in ascending/descending order
	 */

	// Implement in-house LinkedList
	public class LinkedList{


		public class Node{
			int data;
			Node next;

			public Node(int data) {
				this.data = data;
			}
		}

		private Node head;

		public LinkedList() {  super();/***  Empty Constructor  ***/  }

		public void addFront(int data) {
		
			//Create a new Node
			Node newNode = new Node(data); 
								
			//check if head...
			if(head == null) {
				head = newNode;
				return;
			}
			
			// Move the next pointer of new node to head
			newNode.next = head;
			
			// assign head to new node 
			head = newNode;
		}
		
		public void print() {
			if(head == null) return;

			//Start with HEAD
			Node current = head;
			System.out.println();
			//print all the nodes from HEAD to TAIL
			String output;
			while(current!=null) {
				System.out.print(" "+current.data);
				current = current.next;
			}
		}
	}
	
	// Implement a function to sort the list provided we get requirement to either sort ASC /DESC order.

	// Implement main function  
	public static void main(String[] args) {

		// Dataset:  5 X 10 matrix
		int[][] multi = new int[][]{
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
			{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 3, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 5, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
		};

		MergekSortedLists outer = new MergekSortedLists();
		MergekSortedLists.LinkedList[] inner_list = new MergekSortedLists.LinkedList[5];

		int outer_index = 0;
		for( LinkedList inner : inner_list) {
			inner = outer.new LinkedList();
				for(int data : multi[outer_index]) {
					inner.addFront(data);
				}
			inner_list[outer_index++] = inner;
		}
		
		for( LinkedList inner : inner_list) {
			inner.print();
		}

	} // End of Main 

} // End MergekSortedLists
