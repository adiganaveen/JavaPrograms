package com.bridgelabz.datastructuresprograms;


public class Stack
{
	private int maxSize;
	private long[] stackArray;
	private int top;

	public Stack(int s)
	{
	maxSize = s;
	stackArray = new long[maxSize];
	top = -1;
	}

	public void push(long j) throws Exception
	{
	stackArray[++top] = j;
//		if(this.isFull()){
//            throw new Exception("Stack is already full. Can not add element.");
//        }
//        System.out.println("Adding: "+j);
//        this.stackArray[++top] = j;
	}
 
	public long pop() throws Exception 
	{
	return stackArray[top--];
//		if(this.isFull()){
//            throw new Exception("Stack is already full. Can not add element.");
//        }
//        System.out.println("Adding: "+j);
//        return stackArray[top--];
	}

	public long peek() 
	{
	return stackArray[top];
	}
   
	public boolean isEmpty()
	{
	return (top == -1);
	}
  
	public boolean isFull()
	{
	return (top == maxSize - 1);
	}
}