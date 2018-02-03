package com.java.test;

public class CustomLinkedList {

	Node front = null;
	Node rear = null;
	int length=0;
	void add(int value) {
		if(front==null) {
			System.out.println("added" +value);
			Node n = new Node(value,null);
			front=n;
			rear=n;
			length++;
		}
		else {
			System.out.println("added" +value);
			Node n = new Node(value,null);
			front.nextNode=n;
			front=n;
			length++;
		}		
	}
	
	int remove() {
		int valueToRemove = rear.value;
		Node temp=rear.nextNode;
		System.out.println(temp.value);
		rear=temp;
		length--;
		return valueToRemove;	
	}
	
	void removeHigherValues(int value) {
		
		int i = 0;
		int removedNumbers[] = new int[length];
		Node temp=rear;
			while(temp!=null){
				if(temp.value>value)
				{
					removedNumbers[i++]=temp.value;
					temp = temp.nextNode;
					length--;
				}
				else 
					break;
			}
			rear = temp;
			while(temp.nextNode!=null){
				if(temp.nextNode.value>value)
				{
					removedNumbers[i++]=temp.nextNode.value;
					temp.nextNode=temp.nextNode.nextNode;
					length--;
				}
				else
					temp=temp.nextNode;
				
								
		}
			front = temp;
	}
	
	int get(int index) {
		Node temp=rear;
		for(int i=2;i<=index;i++) {
			temp=temp.nextNode;
		}
		return temp.value;
	}
	void put(int index,int value) {
		Node temp = rear;
		if(index==1) {
			Node newNode = new Node(value,null);
			newNode.nextNode=temp;
			rear=newNode;
			length++;
		}
		else {
			for(int i=2;i<index;i++) {
				temp=temp.nextNode;
			}
			Node newNode = new Node(value,null);
			Node tmp = temp.nextNode;
			temp.nextNode=newNode;
			newNode.nextNode=tmp;
			length++;
		}
			
		
	}
	int[] getAll() {
		Node tempRear = rear;
		Node tempFront = front;
		int i = 0;
		int list[] = new int[length];
		while(tempRear!=tempFront){
			list[i++]=tempRear.value;
			tempRear=tempRear.nextNode;
		}
		list[i++]=tempFront.value;
		return list;
	}
}

class Node{	
	 Node(int value, Node nextNode) {
		 System.out.println("created "+ value);
		this.value = value;
		this.nextNode = nextNode;
	}
	int value;
	Node nextNode;	
}