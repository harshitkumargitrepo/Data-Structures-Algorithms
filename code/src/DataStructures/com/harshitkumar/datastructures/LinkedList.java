package com.harshitkumar.datastructures;

public class LinkedList {
	/**
	 * 	Define a Node
	 *  data : an integer data will be stored in LinkedList
	 *  next : a Pointer to next node
	 * @author Harshit Kumar
	 */
	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public Node head;

	// Add the data to the front of the Linked List
	public void addFront(int data) {
		
		//Create a new Node
		Node newNode = new Node(data);
		
		//Special Case : If head is pointing to nothing make it the first node
		if(head == null) {
			head = newNode;
			return;
		}
		//Set the newNode's next pointer to the current head node
		newNode.next = head;
		
		//Set the head to point to the newNode
		head = newNode;
	}
	// Get the first node data of the Linked List
	public int getFirst() {	
		//check if the head
				if(head == null) {
					throw new IllegalStateException("Linked List empty");
				}
		return head.data;
	}
	// Get the last node data of the Linked List
	public int getLast() {
		//check if the head
		if(head == null) {
			throw new IllegalStateException("Linked List empty");
		}
		// goto last node
		
		Node current = head;
		//return last node data
		while(current.next != null) {
			current = current.next;
		}
		return current.data;
	}
	// Add the data to the back of the Linked List
	public void addBack(int data) {
	
		//create the new Node
		Node newNode = new Node(data);
		//Check if head is empty
		if(head==null) {
			head = newNode;
			return;
		}
		//Goto Last node
		Node current = head;
		
		while(current.next != null) {
			current= current.next;
		}
		//last node next point to new Node
		current.next = newNode;
	}
	// get the size of the Linked List
	public int size() {

		//Check if head is null
		if(head ==null) {
			return 0;
		}

		//Brute Force Method to find the size
		Node current = head;
		int size = 1;
		while(current.next != null) {
			size++;
			current = current.next;
		}
		return size;
	}
	// Clear the data of the Linked List
	public void clear() {
		
		//Just make the head point to null. 
		//Java Garbage collector will free up space when it finds unlinked Nodes 
		
		head = null;
	}
	// Delete the data from the Linked List
	public void deleteValue(int data) {
		
		//check if the head is null
		if(head == null) {
			throw new IllegalStateException("Linked List empty"); 
		}
		//check if the head is only node and contains the value

			if(head.data == data) {
				head = head.next;
				return;
			}

		//goto the required node containing the data
		Node current = head;
		
		while(current.next != null) {
			if(current.next.data == data) {
				// move the previous node next pointer to required nodes next node.
				current.next = current.next.next;
				return;		
			}
			current =current.next;
		}
		
	}
	// Print the Linked List
	public void print() {
		//Check if head is null
		if(head == null) {
			System.out.println("Linked List empty");
		}

		//Brute Force Method to find the size
		Node current = head;
		System.out.print("head --> ");
		while(current != null) {
			System.out.print("|"+current.data+"| -->");
			current = current.next;
		}
		System.out.println(" null");
	}
}