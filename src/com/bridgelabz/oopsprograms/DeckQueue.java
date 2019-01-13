package com.bridgelabz.oopsprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.QueueLinkedList;

public class DeckQueue {
	public static void main(String[] args) {
		
		DeckOfCards deck=new DeckOfCards();
		List<Object> deckofcards = new ArrayList<Object>();
		QueueLinkedList<QueueLinkedList<String>> mainQueue = new QueueLinkedList<QueueLinkedList<String>>();
		QueueLinkedList<String> queueLinkedList = new QueueLinkedList<String>();
		deckofcards = deck.getDeckofcards();
		

		System.out.println("Total numver of deck of cards are " + deckofcards.size());
		for (int i = 0; i < 4; i++) {
//			String[] demo = new String[9];
			List<String> deck2 = new ArrayList<String>();
			for (int j = 0; j < 9; j++) {
//				demo[j] = String.valueOf(deckofcards.get(i + j * 4)) ;
				deck2.add(String.valueOf(deckofcards.get(i + j * 4)));
			}
//			String[] str2 = AlgorithmUtility.sortArray1(demo);
//			for (int k = 0; k < str2.length; k++) {
//				queueLinkedList.enqueue(str2[k]);
//			}
			Collections.sort(deck2);
			for(int k=0;k<deck2.size();k++)
			{
				queueLinkedList.enqueue(deck2.get(k));
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
