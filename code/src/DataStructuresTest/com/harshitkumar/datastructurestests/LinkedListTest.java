package com.harshitkumar.datastructurestests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.harshitkumar.datastructures.LinkedList;

public class LinkedListTest {

	private LinkedList linkedList;

	@Before
	public void setUp() throws Exception {
		linkedList = new LinkedList();
	}

	// Add the data to the front of the Linked List
	@Test
	public void AddFront() {
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
	}
	// Get the first node data of the Linked List
	@Test	
	public void GetFirst() {	
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		linkedList.print();
		Assert.assertEquals(3, linkedList.getFirst());
	}
	// Get the last node data of the Linked List
	@Test	
	public void GetLast() {
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		linkedList.print();
		Assert.assertEquals(1, linkedList.getLast());
	}
	// Add the data to the back of the Linked List
	@Test	
	public void AddBack() {
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		linkedList.addBack(10);
		linkedList.print();
		Assert.assertEquals(10, linkedList.getLast());
	}
	// get the size of the Linked List
	@Test	
	public void Size() {
		
		linkedList.print();
		Assert.assertEquals(0, linkedList.size());
		
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		linkedList.addBack(10);
		linkedList.addBack(20);
		linkedList.addBack(30);
		linkedList.print();
		Assert.assertEquals(6, linkedList.size());
	}
	// Clear the data of the Linked List
	@Test	
	public void clear() {
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		linkedList.addBack(4);
		linkedList.addBack(5);
		linkedList.addBack(6);
		linkedList.print();
		
		linkedList.clear();
		linkedList.print();
		Assert.assertEquals(0, linkedList.size());	
	}
	// Delete the data from the Linked List
	@Test	
	public void deleteValue() {
			
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		linkedList.addBack(4);
		linkedList.addBack(5);
		linkedList.addBack(6);
		linkedList.print();
		
		linkedList.deleteValue(3);
		linkedList.print();
		
		Assert.assertEquals(2,linkedList.getFirst());
		
	}

	
	// Print the Linked List
//	@Test	
//	public void print() {
//		fail("Not yet implemented");	
//	}

}
