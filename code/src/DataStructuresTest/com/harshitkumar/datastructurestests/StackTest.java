package com.harshitkumar.datastructurestests;

import com.harshitkumar.datastructures.Stack;
import org.junit.Before;
import static org.junit.Assert.fail;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {

	private Stack stack;

	@Before
	public void setUp() throws Exception{
		stack = new Stack();
	}
	
	@Test
	public void isEmpty() {
		//fail("Not implemented");
		Assert.assertTrue(stack.isEmpty());
	}
	@Test
	public void peek() {
		//fail("Not implemented");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Assert.assertEquals(3, stack.peek());
	}
	@Test
	public void push() {
		stack.push(10);
		
		Assert.assertFalse(stack.isEmpty());
		Assert.assertEquals(10, stack.peek());
		
		stack.push(20);
		Assert.assertEquals(20, stack.peek());
		//fail("Not implemented");
	}
	@Test
	public void pop() {
		//fail("Not implemented");
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		Assert.assertEquals(40, stack.pop());
		Assert.assertEquals(30, stack.pop());
//		Assert.assertEquals(20, stack.pop());
//		Assert.assertEquals(10, stack.pop());
	}
	
	
}
