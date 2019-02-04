package com.interview.randomquestions;

public class MergeTwoSortedLists {

	public class LinkedList{

		public LinkedList() {
			super();
		}

		private class Node{
			int data;
			Node next;
			private Node(int data) {
				this.data = data;
			}
		}

		private Node head;
		private int size;
		public void addFront(int data) {	
			//create a new Node
			Node NewNode = new Node(data);

			//if head..
			if(head == null) { head = NewNode; size = 1; return; }

			// change the next of newNode to point head
			NewNode.next = head;
			// point head to new node
			head = NewNode;
			size++;
		}
		
		
		public void addBack(int data) {	
			//create a new Node
			Node NewNode = new Node(data);

			//if head..
			if(head == null) { head = NewNode; size = 1; return; }

			// get to the tail
			Node current = head;
			while(current.next != null) current=current.next;
			// point head to new node
			current.next =NewNode;
			size++;
		}
		
		
		public void print() {
			//check if head ..
			if(head == null) return;

			Node current = head;
			while(current!=null) {
				System.out.print(" "+ current.data);
				current=current.next;
			}
			System.out.println();
		}

		public int size() {
			return size;
		}

		public Boolean hasNext() {
			if(head == null) return false;
			//if(head.next == null) return false;
			return true;
		}

		public void next() {
			if(head == null) return;
			head = head.next;
		}
		
		public int peak() {
			if(head == null) return -1;
			return head.data;
		}

	}

	public LinkedList merge(LinkedList list1, LinkedList list2) {

		LinkedList temp = new LinkedList();

		while(list1.hasNext() || list2.hasNext()) {
			int num1 = list1.peak();
			int num2 = list2.peak();
			
			if(num1 == -1) { temp.addBack(num2); list2.next(); } 		/*** First list is exhausted  ***/
			else if(num2 == -1) { temp.addBack(num1); list1.next();} 	/*** Second list is exhausted ***/
			// IF BOTH THE LISTS ARE IN INCREASING ORDER WE WILL GET BACK IN DECREASING ORDER if we use addFront and viceversa
			else if(num1<=num2) {
				temp.addBack(num1);	 								/************* O(1)     **********/
				list1.next(); 	   /*** First list number is less than second list number is exhausted ***/
			}	
			else {
				temp.addBack(num2);									/************* O(1)     **********/
				list2.next();	/*** First list number is greater than second list number is exhausted ***/	
			}
		}
		return temp;
	}

	public static void main(String[] args) {

		MergeTwoSortedLists object = new MergeTwoSortedLists();

		LinkedList l1 = object.new LinkedList();
		LinkedList l2 = object.new LinkedList();

		l1.addFront(100);
		l1.addFront(40);
		l1.addFront(47);
		l1.addFront(24);
		l1.addFront(2);
		l1.addFront(1);
		l1.print();
		System.out.println("size:"+l1.size);
		l2.addFront(1000);
		l2.addFront(200);
		l2.addFront(30);
		l2.addFront(4);
		l2.addFront(3);
		l2.print();
		System.out.println("size:"+l2.size);
				MergeTwoSortedLists controller = new MergeTwoSortedLists();
				LinkedList merged = controller.merge(l1, l2);
				merged.print();

	}

}
