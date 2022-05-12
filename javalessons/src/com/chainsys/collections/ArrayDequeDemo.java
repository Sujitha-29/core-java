package com.chainsys.collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<String> arraydeque=new ArrayDeque<String>();
		//Use an ArrayDeque like a stack
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X");//duplicate value
		arraydeque.push("Z");//duplicate value
		arraydeque.push("E");
		arraydeque.push("F");
		System.out.println("Before popping the stack : " + arraydeque.size());
		//while(arraydeque.peek() != null)
		//{
			//System.out.println(arraydeque.pop() + " ");
			//System.out.println("After popping the stack :"+ arraydeque.size());
		//}
		Iterator<String> iterator=arraydeque.iterator();
		while(iterator.hasNext())
		{
			System.out.println("\t"+ iterator.next());
		}
		Iterator<String> striterator=arraydeque.descendingIterator();
		while(striterator.hasNext())
		{
			System.out.println("\t"+ striterator.next());
		}
		arraydeque.addFirst("H");
		arraydeque.addLast("I");
		iterator = arraydeque.iterator();
		while(iterator.hasNext())
		{
			System.out.println("\t" + iterator.next());
		}
		//-----
		//Poll first
		//Retrieves and removes the first element of this deque,or
		//returns null if this dequeue is empty
		System.out.println("*************pollFirst: "+ arraydeque.pollFirst());
		System.out.println(arraydeque);
		System.out.println("************pollLast:" + arraydeque.pollLast());
		System.out.println(arraydeque);
		//----	
		//PeekFirst
		//Retrieves , but does not remove , the  first elementof this deque,or
		//returns null if this dequeue is empty
		System.out.println("*************peekFirst: "+ arraydeque.peekFirst());
		System.out.println(arraydeque);
		System.out.println("************peekLast:" + arraydeque.peekLast());
		System.out.println(arraydeque);
		//----
		System.out.println("*removeFirstOccurence : X" + arraydeque.removeFirstOccurrence("X"));
		System.out.println(arraydeque);
		System.out.println("*removeLastOccurence : X" + arraydeque.removeLastOccurrence("X"));
		System.out.println(arraydeque);
		
	}

}
