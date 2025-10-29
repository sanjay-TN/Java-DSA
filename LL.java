package com.dsa;


public class LL {
	Node head;
	int size=0;
	class Node{
		String data;
		Node next;
	
	Node(String data){
		this.data=data;
		this.next=null;
		size++;
	}
}
//	adding an element at first
public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head == null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
}
//  adding an element at last
public void addLast(String data) {
	Node newNode=new Node(data);
	if(head==null)
	{
		head=newNode;
		return;
	}
	Node currNode = head;
	while(currNode.next!=null) {
		currNode=currNode.next;
	}
	currNode.next=newNode;
}
//  printing list
public void display()
{
	if(head==null) {
		System.out.println("list is empty");
		return;
	}
	Node currNode=head;
	while(currNode!=null) {
		System.out.print(currNode.data+ "->");
		currNode=currNode.next;
	}
	System.out.println("null");
	
}
//  delete at first
public void deleteFirst()
{
	if(head==null) {
		System.out.println("list is empty");
		return;
	}
	size--;
	head=head.next;
}
//  delete at last
public void deleteLast()
{
	if(head==null) {
		System.out.println("list is empty");
		return;
	}
	size--;
	if(head.next==null)
	{
		head=null;
		return;
	}
	Node secondlast=head;
	Node lastNode=head.next;
	while(lastNode.next!=null) {
		lastNode=lastNode.next;
		secondlast=secondlast.next;
	}
	secondlast.next=null;
}
public int getsize()
{
	return size;
}
//	reverse linkedlist using iterator
public void revIterator()
{
	if(head==null || head.next==null)
	{
		return;
	}
	Node prevNode=head;
	Node currNode=head.next;
	while(currNode!=null) {
		Node nextNode=currNode.next;
		currNode.next=prevNode;
		
		prevNode=currNode;
		currNode=nextNode;
	}
	head.next=null;
	head=prevNode;
}
// reverse linkedlist using recursion
public Node rev(Node head)
{
	if(head==null || head.next==null)
	{
		return head;
	}
	Node newHead= rev(head.next);
	head.next.next=head;
	head.next=null;
	return  newHead;
}
	public static void main(String[] args) {
		LL l1=new LL();
		l1.addFirst("a");
		l1.addFirst("s");
		l1.addLast("n");
		l1.display();
		l1.deleteFirst();
//		l1.display();
		l1.deleteLast();
//		l1.display();
		System.out.println(l1.getsize());
		
		l1.addFirst("s");
		l1.addLast("n");
		l1.revIterator();
//		l1.head=l1.rev(l1.head);
		l1.display();
		
	}

}
