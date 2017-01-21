package com.agni.practice.linklist;

public class RemovingLoop {
	static Node head;
	
	static class Node{
		Node next;
		int data;
		public Node(int d) {
			data =d;
			next=null;
		}
	}
	void detectAndRemoveLoop(Node node){
		Node slow=node,fast=node.next;
		while(fast!=null && fast.next !=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				slow = node;
				while(slow != fast.next){
					slow=slow.next;
					fast= fast.next;
				}
				fast.next=null;
			
			}
		}
		
	}
	
	void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	public static void main(String[] args) {
		RemovingLoop list = new RemovingLoop();
		list.head = new Node(1);
		list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
 
         
        head.next.next.next.next.next = head.next.next;
        //list.printList(head);
        list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);

	}

}
