package com.java.test;

import java.util.Scanner;

public class LinkedListOperations {
	public static void main(String[] args) {
		
		CustomLinkedList linkedList = new CustomLinkedList();
		
		Scanner keyboard = new Scanner(System.in);
		boolean loop=true;
		while(loop) {
			System.out.println("enter yout options ");
			System.out.println("1.Add ");
			System.out.println("2.Remove from tail ");
			System.out.println("3.Get an element throgh index ");
			System.out.println("4.To remove elements greater than speicified element ");
			System.out.println("5.List Elements");
			System.out.println("6.ti insert element to specified index");
			System.out.println("7.Exit");
			int choice = keyboard.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter element to add");
				int value = keyboard.nextInt();
				linkedList.add(value);
				break;
				
				
				
			case 2:
				linkedList.remove();
				break;
				
				
			case 3:
				System.out.println("enter index");
				value = keyboard.nextInt();
				System.out.println(linkedList.get(value));
				break;
				
				
			case 4:
				System.out.println("enetr element which you want delete greater than specified ");
				value = keyboard.nextInt();
				linkedList.removeHigherValues(value);
				break;
				
			case 5:
				int arr[]= linkedList.getAll();
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
				break;
			case 6:
				System.out.println("enter index where u want insert");
				int index = keyboard.nextInt();
				System.out.println("enter value ");
				value = keyboard.nextInt();
				linkedList.put(index,value);
				break;
				
			case 7:
				loop=false;
				break;
						
			}
		}
		
			
		
	}

}
