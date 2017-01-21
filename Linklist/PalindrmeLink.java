
public class palindrome {
	  Node first;
	  Node slow_ptr, fast_ptr,second_half;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next= null;
		}
	}
	boolean isPalinderome (Node head){
		slow_ptr= head; fast_ptr = head;
		Node pre_slw_pntr = head;
		Node midnode ;
		boolean result= false;
		if(head != null && head.next != null){
			while(fast_ptr != null && fast_ptr.next != null){
				fast_ptr = fast_ptr.next.next;
				pre_slw_pntr = slow_ptr;
				slow_ptr = slow_ptr.next;
			}
			if(fast_ptr != null){
				midnode = slow_ptr;
				slow_ptr = slow_ptr.next;
			}
		}
		
		
		return result;
	}
	
	void reverse(){
		Node prev = null;
		Node current = second_half;
		Node next;
		while(current !=null){
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;		
		}
		second_half = prev;
	}
	
	
	
	
	void printList(){
		Node tmp= first;
		while(first.next != null){
			System.out.print(first.data+" ->");
		}
	}
	
	public static void main(String[] args) {
		palindrome linklist = new palindrome();
		linklist.first = linklist.new Node(1);
		
	}

}
