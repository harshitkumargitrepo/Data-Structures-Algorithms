package com.harshitkumar.datastructurestests;

import com.harshitkumar.datastructures.Queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

import org.junit.Assert;

public class QueueTest {

	private Queue queue;
	
	@Before
	public void setUp() throws Exception{
		queue = new Queue();
	}
	
	@Test
	public void isEmpty() {
	//	fail("Not yet implemented");
	Assert.assertTrue(queue.isEmpty());
	}
	
	@Test
	public void peak() {
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		Assert.assertEquals(1, queue.peek());
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void add() {
	
		//fail("Not yet implemented");
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		Assert.assertFalse(queue.isEmpty());
		
	}
	
	@Test
	public void remove() {
		//fail("Not yet implemented");
		queue.add(1);
		queue.add(2);
		queue.add(3);
		Assert.assertEquals(1, queue.remove());
		Assert.assertEquals(2, queue.remove());
		Assert.assertEquals(3, queue.remove());
	}
	
}
