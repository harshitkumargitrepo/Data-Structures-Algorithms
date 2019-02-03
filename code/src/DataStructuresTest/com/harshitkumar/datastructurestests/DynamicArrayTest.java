package com.harshitkumar.datastructurestests;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.harshitkumar.datastructures.DynamicArray;

public class DynamicArrayTest {

	private DynamicArray<String> array;
	
	@Before
	public void Setup() throws Exception {
		array = new DynamicArray<String>(2); 
	}
	
	
	@Test
    public void GetAndSet() throws Exception {
		//		fail("To Be implemented");
		array.set(0, "A");	
		array.set(1, "B");		
		Assert.assertEquals("B", array.get(1));
	}

    @Test
    public void Insert() throws Exception {
    	//fail("To Be implemented");
    	array.insert(0,"A");
    	array.insert(1,"B");
    	// Check if the index is out of bound
    	array.insert(2,"C");
    	array.insert(3,"D");
    	//Check if the size is full
    	array.insert(3,"C-D");
    	
    	Assert.assertEquals("C", array.get(2));	
    	Assert.assertEquals("D", array.get(4));
    	
    }

    @Test
    public void Delete() throws Exception {
    	array.add("A");
    	array.add("B");
    	array.insert(2, "C");
    	array.add("D");
    	array.add("E");
    	array.insert(6, "F");
    	array.delete(0);
    	array.delete(0);
    	
    }

    @Test
    public void isEmpty() throws Exception {
    	
    	//fail("To Be implemented");
    	array.insert(0,"A");
    	array.insert(1,"B");
    	array.insert(1,"C");
    	Assert.assertFalse(array.isEmpty());
    }

    @Test
    public void Contains() throws Exception {
        //fail("To Be implemented");
    	array.add("A");
    	array.add("B");
    	array.insert(4, "C");
    	array.add("D");
    	Assert.assertTrue("Value not found",array.Contains("C"));
    }
	
	
    @Test
    public void add() throws Exception {
        //fail("To Be implemented");
    	array.add("A");
    	array.add("B");
    	array.insert(4, "C");
    	array.add("D");
    	Assert.assertEquals("D", array.get(array.size()-1));
    	
    }
	
}
