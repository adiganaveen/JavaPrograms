package com.bridgelabz.oopsprograms;

import com.bridgelabz.oopsprograms.Card.Rank;
import com.bridgelabz.oopsprograms.Card.Suit;
import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.QueueLinkedList;

public class DeckQueue {
	public static void main(String[] args) {
		String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King", "Ace" };
		int n = Suits.length * Ranks.length;
		String[] deck = new String[n];
		for (int i = 0; i < Ranks.length; i++) {
			for (int j = 0; j < Suits.length; j++) {
				deck[Suits.length * i + j] = Suits[j] + " " +Ranks[i] ;
			}
		}
//		public enum Rank {
//			DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
//		}
//
//		public enum Suit {
//			CLUBS, DIAMONDS, HEARTS, SPADES
//		}
//
//		private final Rank rank;
//		private final Suit suit;
//
//		private Card(Rank rank, Suit suit) {
//			this.rank = rank;
//			this.suit = suit;
//		}
//
//		public Rank rank() {
//			return rank;
//		}
//
//		public Suit suit() {
//			return suit;
//		}
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		QueueLinkedList<QueueLinkedList<String>> mainQueue=OopsUtility.deckQueueStore(deck);
		OopsUtility.deal(mainQueue);
	}
}
