package com.harshitkumar.datastructures;

public class Queue {

	private class Node{
		int data;
		Node next;
		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node head;	 /**** remove things here  ****/
	private Node tail;   /**** add things here     ****/
	
	public boolean isEmpty() {
		return head == null;
	}

	// show the first element added to Queue
	public int peek() {
		return head.data;
	}
	
	// Add the data to tail.
	public void add(int data) {
		//Create New node
		Node newNode = new Node(data);
		// Set the current tail.next to point to this new node
        if (tail != null) {
            tail.next = newNode;
        }
		// Then set the new node to be the new tail
		tail = newNode;
		
		/// handle case of first element where head is null
		if(head == null) {
			head = tail;
		}
	}
	
	//Remove the first Node inserted i.e Head data - Queue follows FIFO
	public int remove() {
		
		// Save the data
        // Point the head to the next element (effectively removing it)
        // Then return the data
		
		int data = head.data;
		head = head.next;
		
        // Handle queue now being empty
		if(head == null) {
			tail = null;
		}
		
		return data;
	}
}
