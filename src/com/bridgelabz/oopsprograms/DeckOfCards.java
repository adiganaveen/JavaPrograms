package com.bridgelabz.oopsprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.bridgelabz.util.Card;

public class DeckOfCards {
	private final String[] suite = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private final String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	private static List<Object> deckofcards = new ArrayList<Object>();

	public DeckOfCards() {
		for (int i = 0; i < suite.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deckofcards.add(new Card(rank[j], suite[i]));
			}
		}
	}

	public List<Object> getDeckofcards() {
		return deckofcards;
	}

	public int getSuiteSize() {
		return suite.length;
	}

	public int getRankSize() {
		return rank.length;
	}

	public int getDeckSize() {
		return deckofcards.size();
	}

	public void shuffle() {
		try {
			Object[] cards = deckofcards.toArray();
			Random randomNumbers = new Random();

			for (int first = 0; first < cards.length; first++) {

				int second = randomNumbers.nextInt(cards.length);

				Object temp = cards[first];
				cards[first] = cards[second];
				cards[second] = temp;
			}
			deckofcards = Arrays.asList(cards);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
