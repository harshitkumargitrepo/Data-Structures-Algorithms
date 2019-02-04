package com.interview.randomquestions;



public class ValidParentheses {

	public class Stack<Character>{

		private class Node{
			char data;
			Node next;
			private Node(char data) {
				this.data=data;
			}
		}

		private Node head;

		public boolean isEmpty() { 	return head == null; }
		public void push(char c) {
			//Create a new node
			Node newNode = new Node(c);

			//if head...
			if(head == null) { head = newNode; return; }

			//make the next pointer of new node point to head
			newNode.next = head;

			// make head point to newNode
			head = newNode;
		}

		public char pop() {

			//check if stack is empty
			if(isEmpty()) {
				throw new IllegalStateException("Stack empty");
			}

			char data = head.data;
			head = head.next;
			return data;
		}

	}

	public boolean isValid(String s, char[] validParentheses) {
		Stack<Character> stack = new Stack<>();
		String validP = new String(validParentheses);
		for(Character ch : s.toCharArray()){
			if(	!(validP.indexOf(ch)<0)) 
			{
				if(ch == '('){
					stack.push(')');
				}else if(ch == '['){
					stack.push(']');
				}else if(ch == '{'){
					stack.push('}');
				}else if(stack.isEmpty() || stack.pop() != ch){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		String sent = "I am [going to (say) to you]";
		char[] validParentheses = {'(',')','[',']','{','}'};
		ValidParentheses validator = new ValidParentheses();
		System.out.println(validator.isValid(sent,validParentheses));
	}

}
