package com.agni.practice.stack;

import java.util.Arrays;
import java.util.List;
	
	class Stack<T> {
		
		class Node<T> {
			private T data;
			private Node<T> next;
			public Node(T data) {
				this.data = data;
			}
			@Override
	        public String toString() {
	            return data.toString();
	        }
			
		}
		
		private Node<T> first = null;
		private void addFirst (T data){
			Node<T> newfirst = new Node<T>(data);
			newfirst.next = first;
			first = newfirst;
		}
		private T removeFirst(){
			Node<T> oldFirst = first;
			first = first.next;
			return oldFirst.data;

		}
		 @Override
		    public String toString() {
		        StringBuilder builder = new StringBuilder();
		        Node current = first;
		        while (current != null) {
		            builder.append(current).append(" ");
		            current = current.next;
		        }
		        return builder.toString();
		    }
		 private final Stack<T> linkedList = new Stack<T>();

		    public boolean isEmpty() {
		        return first == null;
		    }
		    public void push(T data) {
		        linkedList.addFirst(data);
		    }

		    public T pop() {
		        return linkedList.removeFirst();
		    }

		    
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(50, 70, 190, 20);
	    Stack<Integer> st = new Stack<Integer>();
	    
	    for (Integer value : values) {
	        st.push(value);
	    }
	    
	    for (int i = values.size(); i > 0; --i) {
	       // assertEquals(values.get(i - 1), st.pop());
	    }
	}

}
