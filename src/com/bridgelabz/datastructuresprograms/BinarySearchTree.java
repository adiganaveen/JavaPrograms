package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.util.DataStructureUtility;

class BinarySearchTree { 
    // Driver Program to test above functions 
    public static void main(String[] args) { 
        double count1;
        System.out.println("Enter the number of elements");
        int num=DataStructureUtility.userInteger();
        int[] intArr=new int[num];
        for(int i=0;i<intArr.length;i++)
        {
        	System.out.println("Enter the "+i+" th number:");
        	intArr[i]=DataStructureUtility.userInteger();
        }
        double [] count=new double[intArr.length];
        for(int i=0;i<intArr.length;i++)
        {
        	
        	count[i] = DataStructureUtility.countBinary(intArr[i]);
        }
         for(int i=0;i<count.length;i++)
         {
        	 System.out.println("Count of BST possibilities for "+  intArr[i] +" nodes is "+count[i]);
         }
    } 
}  