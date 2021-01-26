package edu.kis.vh.nursery.IntStosTypes;

import edu.kis.vh.nursery.IntStos;

public class IntLinkedList implements IntStos {

	Node last;
	int i;


	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return RETVAL;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return RETVAL;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
