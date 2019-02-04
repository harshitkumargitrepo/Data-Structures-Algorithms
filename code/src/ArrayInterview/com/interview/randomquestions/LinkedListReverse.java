package com.interview.randomquestions;

public class LinkedListReverse {

	public class LinkedList{
		private class Node {
			int data;
			Node next;
			private  Node(int data) {
				this.data = data;
			}
		}

		private Node head;
		private boolean isEmpty() {  return head == null; }

		private int peek() {
			if(head == null) {
				throw new IllegalStateException("LinkedList empty");	
			}
			return head.data;
		}

		private void addFront(int data) {
			//create a new node
			Node newNode = new Node(data);

			//check if head...
			if(head == null) {
				head = newNode;
				return;
			}

			// assign new Node next to point head
			newNode.next = head; 
			// point head to new node
			head = newNode;
		}

		private void addBack(int data) {
			//create a new node
			Node newNode = new Node(data);

			//check if head...
			if(head == null) {
				head = newNode;
				return;
			}

			// goto tail
			Node current = head;
			while(current.next!=null) current= current.next;
			// point tail to new node
			current.next = newNode;
		}

		private void print() {
			
			if(head == null) {
				System.out.println("LinkedList Empty");
				return;
			}
			
			Node current = head;
			while(current!=null) {
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
		private boolean hasNext() {
			return(head != null);
		}
		
		private int Next() {
			//if head ...
			if(head == null) {
				throw new IllegalStateException("LinkedList empty");
			}
			
			int data = head.data;
			head = head.next;
			return data;
		}

	} // End of inner Linkedlist.class

	public static void main(String[] args) {

		LinkedListReverse controller = new LinkedListReverse();
		LinkedList list1 = controller.new LinkedList(); 
		LinkedList list1copy = controller.new LinkedList();
		
		list1.addBack(10);
		list1.addBack(5);
		list1.addBack(3);
		list1.addBack(2);
		list1.addBack(1);
		list1.print();
		
		// reverse LinkedList
		while(list1.hasNext()) {
			list1copy.addFront(list1.Next());
		}		
		list1 = list1copy;
		
		list1.print();
	}// end of main program

} // End of LinkedListSort.class

