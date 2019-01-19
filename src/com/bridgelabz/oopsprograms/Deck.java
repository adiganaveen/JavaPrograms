package com.bridgelabz.oopsprograms;

import com.bridgelabz.util.OopsUtility;

public class Deck {
	public static void main(String[] args) {
		String [] deck=OopsUtility.deckRandom();
		System.out.println("Total numver of deck of cards are " + deck.length);
		for (int i = 0; i < 4; i++) {
			System.out.println("----- Person " + (i + 1) + " -----");
			for (int j = 0; j < 9; j++) {
				System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
			}
		}
	}

}