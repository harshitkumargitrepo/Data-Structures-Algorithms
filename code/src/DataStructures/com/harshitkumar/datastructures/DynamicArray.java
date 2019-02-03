package com.harshitkumar.datastructures;


public class DynamicArray<String>  {

	private Object[] data;
	private int size;				/** to track the number of elements present in Array **/
	private int initialCapacity;	/** to check the size of the overall Array we have **/

	//******Create the initial capacity Array******* 
	public DynamicArray(int intialCapacity) {
		this.initialCapacity = intialCapacity;
		data = new Object[intialCapacity];
	}


	/**
	 * Following logics will be demonstrated in Dynamic Array:
	 * get(int index)  - return String
	 * set(int index, String value)
	 * insert(int index, String value)
	 * delete(int index)
	 * isEmtpy() - return Boolean
	 * Contains(String value) - return Boolean
	 * resize()
	 * size() - return int
	 * add(String value)           <-- to insert at the end of the array
	 */

	public String get(int index) throws Exception{
		//Get the value at specified Index
		if(index>=initialCapacity) {
			throw new IllegalStateException("Index is out of Bound"); 
		}
		System.out.println("\n Value at array["+index+"]="+data[index].toString());
		return  (String) data[index];             /***   O(1)   *****/

	}

	public void set(int index, String value){
		//Set the value at the required index
		data[index] = value;               /***   O(1)   *****/
	}

	public void insert(int index, String value) {

//		System.out.println("\n Initial State before inserting " + value + ". Array has size = "+size()+" elements"+" and Capacity = "+ initialCapacity);
//		print();
		
		// Check size if full or index is out of bound
		while(size == initialCapacity || index >= initialCapacity) {
			if(index >= initialCapacity) {
				System.out.println("\nIndex out of bound : Increasing capacity to 2 times");
			}else if(size == initialCapacity){
				System.out.println("\ninitial size full  : Increasing capacity to 2 times");
			}
			resize();

			// Copy up
			System.out.println();
			for(int i = initialCapacity-1; i>index; i--) {
				this.data[i] = this.data[i-1];
			}
		}
		
		// Insert
		set(index,value);
		size++;
//		System.out.println("\n Final State after inserting " + value + ". Array has new size = " + size()+" elements and Capacity = "+ initialCapacity);
//		print();
//		System.out.println("\n**************************************");
	}

	private void resize() {
		Object[] newData = new Object[initialCapacity*2];
		for(int i= 0; i<initialCapacity;i++) {
			newData[i] = this.data[i];
		}
		this.data = newData;
		initialCapacity = initialCapacity*2;
	}

	public int size() {
		return size;
	}

	public void print() {
		int loopsize = initialCapacity-1;
		while(loopsize>=0) {
			System.out.print("  array["+(initialCapacity-1-loopsize)+"]="+ data[initialCapacity-1-loopsize]+"  ");
			loopsize--;
		}
	}

	// Some array implementations offer methods like insert (also known as pushBack).
	// Which is like insert, only in does the insert at the end of the array.
	public void add(String value) {

//		System.out.println("\n Initial State before inserting " + value + ". Array has size = "+size()+" elements"+" and Capacity = "+ initialCapacity);
//		print();

		    //Check size if full 
		if(size == initialCapacity) {
			System.out.println("\n ------> Size of array full : Increasing capacity to 2 times");
			resize();		
		}
		set(size,value);
		size++;
		
//		System.out.println("\n Final State after inserting " + value + ". Array has new size = " + size()+" elements and Capacity = "+ initialCapacity);
//		print();
//		System.out.println("\n**************************************");
	}

	public void delete(int index) {

		System.out.println("\n Initial State before deleting at index " + index + ". Array has size = "+size()+" elements"+" and Capacity = "+ initialCapacity);
		print();

		//Check if index is out of bound
		if(index>=initialCapacity) {
			throw new IllegalStateException("Index out of bound");
		}
		//Shift one element to the left of the index
		int i = index;
		while(i<initialCapacity-1) {
			this.data[i] = this.data[i+1];
			i++;
		}
		this.data[i] = null;
		size--;
		System.out.println("\n Final State after deleting at index " + index + ". Array has new size = " + size()+" elements and Capacity = "+ initialCapacity);
		print();
		System.out.println("\n**************************************");
	}

	public boolean isEmpty() {

//		if(size() == 0)
//			return true;
//		else
//			return false;
		
		return size == 0;
	}

	public boolean Contains(String value) {
		print();
		System.out.println();
		int i = initialCapacity-1;
		while(i>=0) {
			if(data[i]== value) {
				System.out.println("Item "+value+" found at array["+i+"]");
				return true;
			}
			i--;
		}
		return false;
	}


}
