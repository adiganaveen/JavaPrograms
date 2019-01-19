package com.bridgelabz.oopsprograms;

import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.QueueLinkedList;

public class DeckQueue {
	public static void main(String[] args) {
		String [] deck=OopsUtility.deckRandom();
		QueueLinkedList<QueueLinkedList<String>> mainQueue=OopsUtility.deckQueueStore(deck);
		OopsUtility.deal(mainQueue);
	}
}
