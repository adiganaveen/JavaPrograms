package com.bridgelabz.datastructuresprograms;

import java.util.Iterator;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;

	public void add(T element) {

		Node<T> nd = new Node<T>();
		nd.setValue(element);
		// System.out.println("Adding: "+element);
		if (head == null) {
			head = nd;
			tail = nd;
		} else {
			tail.setNextRef(nd);
			tail = nd;
		}
	}

	public void addAfter(T element, T after) {

		Node<T> tmp = head;
		Node<T> refNode = null;
		System.out.println("Traversing to all nodes..");
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.compareTo(after) == 0) {
				refNode = tmp;
				break;
			}
			tmp = tmp.getNextRef();
		}
		if (refNode != null) {
			Node<T> nd = new Node<T>();
			nd.setValue(element);
			nd.setNextRef(tmp.getNextRef());
			if (tmp == tail) {
				tail = nd;
			}
			tmp.setNextRef(nd);

		} else {
			System.out.println("Unable to find the given element...");
		}
	}

	public void deleteFront() {

		if (head == null) {
			System.out.println("Underflow...");
		}
		Node<T> tmp = head;
		head = tmp.getNextRef();
		if (head == null) {
			tail = null;
		}
		System.out.println("Deleted: " + tmp.getValue());
	}

	public void deleteAfter(T after) {

		Node<T> tmp = head;
		Node<T> refNode = null;
		System.out.println("Traversing to all nodes..");
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.compareTo(after) == 0) {
				refNode = tmp;
				break;
			}
			tmp = tmp.getNextRef();
		}
		if (refNode != null) {
			tmp = refNode.getNextRef();
			refNode.setNextRef(tmp.getNextRef());
			if (refNode.getNextRef() == null) {
				tail = refNode;
			}
			System.out.println("Deleted: " + tmp.getValue());
		} else {
			System.out.println("Unable to find the given element...");
		}
	}

	public int traverse() {

		Node<T> tmp = head;
		int i = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getValue());
			i++;
			tmp = tmp.getNextRef();
		}
		return i;
	}

	public boolean printValue(int length, String key, LinkedList<String> li) {
		Node<T> nd2 = head;
		int flag=1;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if (key.compareToIgnoreCase(String.valueOf(nd2.getValue())) == 0) {
				return true;
			} 
			nd2 = nd2.getNextRef();
		}
		li.add(key);
		li.traverse();
		return false;

	}

}

class Node<T> implements Comparable<T> {

	private T value;
	private Node<T> nextRef;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> ref) {
		this.nextRef = ref;
	}

	@Override
	public int compareTo(T arg) {
		if (arg == this.value) {
			return 0;
		} else {
			return 1;

		}
	}
}
