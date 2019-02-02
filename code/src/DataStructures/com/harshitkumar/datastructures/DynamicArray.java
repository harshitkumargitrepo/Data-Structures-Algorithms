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
	
	public String get(int index) {
		return null;
    }

    public void set(int index, String value) {

    }

    public void insert(int index, String value) {

        // Check size

        // Copy up

        // Insert
    }

    private void resize() {

    }

    public int size() {
    	return 0;
    }

    public void print() {

    }

    // Some array implementations offer methods like insert (also known as pushBack).
    // Which is like insert, only in does the insert at the end of the array.
    public void add(String value) {

    }

    public void delete(int index) {
        
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean Contains(String value) {
        return false;
    }
	
	
}
