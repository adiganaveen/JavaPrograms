package com.bridgelabz.util;

public class Card
{
     private String rank;
     private String suit;
 
     public Card( String cardRank, String cardSuite)
     {
        rank = cardRank;
        suit = cardSuite;
     } 

     public String getRank() 
     {
		return rank;
	 }
 
	 public void setRank(String rank) 
	 {
		this.rank = rank;
	 }
 
	 public String getSuit() 
	 {
		return suit;
	 }
 
	 public void setSuit(String suit) 
	 {
		this.suit = suit;
	 }
 
	 
//	 public int compareTo(Card crd) {
// 
//         if (crd instanceof Card) {
// 
//             Card card = (Card) crd;
//             if (this.rank > card.getRank())
//                 return 1;
//             else if (this.rank < card.getRank())
//                 return -1;
//         }
//         return 0;
//     }
//	 
 
	 // return String representation of Card
     public String toString()               
     {                                      
        return rank + " " + suit;        
     } // end method toString               
  } 