package com.bridgelabz.util;


public class Deque<E> {
	public E data;
	Deque<E>next;
	Deque<E>pre;
	Deque<E> front;
	Deque<E> rear;
	int size=0;

	public Deque(E val)
	{
		this.data=val;
		this.next=null;
		this.pre=null;
    }
	
	public void addFront(E c)
	{
		if(front==null) 
		{
			Deque<E>tNode=new Deque<>(c);
			front=tNode;
			rear=front;
		}
		else  
		{
			Deque<E>tNode=new Deque<>(c);
			front.pre=tNode;
			tNode.next=front;
			front=tNode;
		}
		size++;
	}
	

	public void addRear(E c)
	{
		if(front==null)
		{
			Deque<E>tNode=new Deque<E>(c);
			front=tNode;
			rear=front;
		}
		else  
		{
			Deque<E>tNode=new Deque<>(c);
			rear.next=tNode;
			tNode.pre=rear;
			rear=tNode;
		}
		size++;
	}
	

	public E removeFront()
	{
		E val=null;
		if(front==null)
		{
			System.out.println("No elements to delete");
		}
		else
		{
			val=front.data;
			front=front.next;
		}
		size--;
		return val;
	}
	

	public E removeRear()
	{
		E val=null;
		if(front==null)
		{
			System.out.println("No element to delete");
		}
		else
		{
			val=rear.data;
			rear=rear.pre;
			rear.next=null;
		}
		size--;
		return val;
	}
	

	public boolean isEmpty()
	{
		if(front==null)
			return true;
		else
			return false;
	}
 
	public int size()
	{
		return size;
}
}
