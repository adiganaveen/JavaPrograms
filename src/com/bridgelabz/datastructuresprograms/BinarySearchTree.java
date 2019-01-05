/******************************************************************************
 *  Compilation:  javac -d bin BinarySearchTree.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.BinarySearchTree n
 *  
 *  Purpose: Number of Binary Search Tree
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   2-12-2018
 *
 ******************************************************************************/

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