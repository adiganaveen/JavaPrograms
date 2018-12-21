//Algorithm Utility
/*Naveen Adiga
  21/12/2018
 */

package com.bridgelabz.util;

import java.math.BigInteger;
import java.util.Arrays;

public class AlgorithmUtility {
	// anagram detection
	public boolean anagramDetection(String str1, String str2) {
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		int f = ch1.length - 1;
		if (ch1.length != ch2.length) {
			return false;
		} else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] == ch2[i]) {
					return true;
				}
//			str1 = String.valueOf(ch1);
//			str2 = String.valueOf(ch2);
//			boolean  b = str1.equals(str2);
//			{
//				if (b == true)
//					return true;
//			}
			}
			return false;
		}

	}

	// to find range of prime numbers
	public boolean findPrimeNumber(long num) {
//		int flag=0;
//		for(int i=2;i<num;i++)
//		{
//			for(int j=2;j<i;j++)
//			{
//				if(i%j==0)
//				{
//					flag=0;
//				}
//				else 
//					flag=1;
//			}
//			if(flag==1)
//			{
//				System.out.println(i+" ");
//			}
//		}
		BigInteger b = new BigInteger(String.valueOf(num));
		return b.isProbablePrime(1);
	}
}
