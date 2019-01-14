package com.bridgelabz.oopsprograms;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.QueueLinkedList;

public class DeckQueue2 {
	public static void main(String[] args) {
		String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int n = Suits.length * Ranks.length;
		String[] deck = new String[n];
		for (int i = 0; i < Ranks.length; i++) {
			for (int j = 0; j < Suits.length; j++) {
				deck[Suits.length * i + j] = Ranks[i] + "_" + Suits[j];
			}
		}
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		QueueLinkedList<QueueLinkedList<String>> mainQueue = new QueueLinkedList<QueueLinkedList<String>>();
		QueueLinkedList<String> queueLinkedList = new QueueLinkedList<String>();
		System.out.println("Total numver of deck of cards are " + deck.length);
		for (int i = 0; i < 4; i++) {
			String[] demo = new String[9];
			for (int j = 0; j < 9; j++) {
				demo[j] = deck[i + j * 4];
			}
			String[] str2 = AlgorithmUtility.sortArray1(demo);
			for (int k = 0; k < str2.length; k++) {
				queueLinkedList.enqueue(str2[k]);
			}
			mainQueue.enqueue(queueLinkedList);
			queueLinkedList = new QueueLinkedList<String>();
			continue;
		}

		for (int i = 0; i < mainQueue.getSize(); i++) {
			QueueLinkedList<String> queue2 = mainQueue.dequeue();
			System.out.println("---------------------------------------- Person " + (i + 1)
					+ " -------------------------------------------");
			for (int j = 0; j < queue2.getSize(); j++) {
				System.out.print(queue2.dequeue() + " ");
			}
			System.out.println();
		}
	}
}
