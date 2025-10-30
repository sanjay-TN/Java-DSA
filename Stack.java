package com.dsa;

import java.util.*;

public class Stack {
//	it follows LIFO principle.[last in first out].
//	it has 3 operation push(),pop(),peek().[all 3 operation has O(1) time complexity].
	
//	stack using linked list
	/*static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	static class Stacks{
		public static Node head;
		
		public static boolean isEmpty()
		{
			return head==null;
		}
		
		public static void push(int data)
		{
			Node newNode=new Node(data);
			if(isEmpty()) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
			
		}
		
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=head.data;
			head=head.next;
			return top;
			
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
				
			}
			return head.data;
		}
		
	}
*/
	
//	stack using arraylist
	static class Stacks{
		static ArrayList<Integer> list=new ArrayList<>();
		public static boolean isEmpty() {
			return list.size() ==0;
		}
		
//		push
		public static void push(int data) {
			list.add(data);
		}
		
//		pop
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
//		peek
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
		
	}
	
	public static void main(String[] args) {
		Stacks s=new Stacks();
		s.push(3);
		s.push(2);
		s.push(4);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
	}

}
