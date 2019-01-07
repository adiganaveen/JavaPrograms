package com.bridgelabz.util;


public class Deque<E> {
	/**
	 * to get value of a node data
	 */
	public E data;
	/**
	 * it would be having next node reference
	 */
	Deque<E>next;
	/**
	 * it would be having earlier node reference
	 */
	Deque<E>pre;
	/**
	 * it will be the first node
	 */
	Deque<E> front;
	/**
	 * it will be the last node
	 */
	Deque<E> rear;
	int size=0;

	/**
	 * constructor is used to store value onto data
	 * @param val
	 */
	public Deque(E val)
	{
		this.data=val;
		this.next=null;
		this.pre=null;
    }
	
	/**
	 * to add it on to front of deque
	 * @param c is generic
	 */
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
	

	/**
	 * to add it on to rear of deque
	 * @param c is generic
	 */
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
	

	/**
	 * to remove it on to front of deque
	 * @return is generic
	 */
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
	

	/**
	 *  to remove it on to rear of deque
	 * @return is generic
	 */
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
	

	/**
	 * to deque is empty or not
	 * @return boolean type
	 */
	public boolean isEmpty()
	{
		if(front==null)
			return true;
		else
			return false;
	}
 
	/**
	 * to check size of deque
	 * @return integer type
	 */
	public int size()
	{
		return size;
}
}
