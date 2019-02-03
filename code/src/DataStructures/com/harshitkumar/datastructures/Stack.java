package com.harshitkumar.datastructures;

public class Stack {

	private class Node{
		int data;
		Node next;
		private Node(int data) {
			this.data = data;
		}
	}
	
	/*********************************************/
	/*    STACK     |        |                   */
	/*              |        |                   */
	/*              |    3   | <---- HEAD        */
	/*              |    2   |                   */
	/*              |____1___|                   */
	/*********************************************/
	
	private Node head;			/*** Track Head ***/
	private int  size;			/*** Track Size ***/
	
	//Show the data on the top of the stack.
	public int peek() {return head.data; }
	
	// Check if stack is empty
	public boolean isEmpty() {
		return head == null;
	}
	
	// To push the item at head
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	// To pop the first item - LIFO
	public int pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack empty");
		}
		int data = head.data;
		head = head.next;
		size--;
		return data;
	}
	
}
