/******************************************************************************
 *  Compilation:  javac -d bin QueueLinkedList.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.QueueLinkedList n
 *  
 *  Purpose: Custom queue
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   01-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class QueueLinkedList<T>{
	/*
	 * Front and rear are of the type Node and is 
	 * declared private to achieve encapsulation 
	 */
	public Node<T> front,rear;
	public int size=0;

	/**
	 * Constructor to initialize the instance variables of 
	 * class Queue
	 */
	public QueueLinkedList(){
		front=null;
		rear=null;
		size=0;
	}
	
	/**
	 * Function to check if the queue is empty or not
	 * 
	 * @return true if empty else false
	 */
	public boolean isQueueEmpty(){
		return front==null;
	}
	/**
	 * Function to get the size of the queue
	 * 
	 * @return size
	 */
	public int getSize(){
		return size;
	}
	/**
	 * Function to insert the specified element in the queue
	 * 
	 * @param data the element to be inserted into the queue
	 */
	public void enqueue(T data){
		Node<T> node=new Node<T>(data,null);
		if(rear==null){
			front=node;
			rear=node;
		}
		else{
			rear.setNextRef(node);
			rear=rear.getNextRef();
		}
		size++;
	}
	/**
	 * Function to remove the element 
	 * 
	 * @return the deleted element 
	 */
	public T dequeue(){
		if(isQueueEmpty())
		{
			System.out.println("Underflow");
		}
		Node<T> curr=front;
		front = curr.getNextRef();        
        if (front == null){
            rear = null;
			size-- ; 
		} 
        return curr.getValue();
	}

	/**
	 * Function to display all the elements in the queue
	 */
	public void display(){  
		if(isQueueEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		else{
			Node<T> tNode=front;
			while(tNode!=null){
				System.out.print(tNode.getValue()+" ");
				tNode=tNode.getNextRef();
			}
			
		}
	}
	 
	 
}
