package edu.kis.vh.nursery;


import edu.kis.vh.nursery.IntStosTypes.IntArrayStack;

/**
 * DefaultCountingOutRhymer - klasa zawierajca tablice liczb, i pozwalajaca na modyfikacje tej tablicy
 */

public class DefaultCountingOutRhymer {

	private final IntStos st;

	public DefaultCountingOutRhymer(IntStos st) {
		this.st = st;
	}


	public void countIn(int in) {
		st.push(in);
	}

	public boolean callCheck() {
		return st.isEmpty();
	}

	public boolean isFull() {
		return st.isFull();
	}

	protected int peekaboo() {
		return st.top();
	}

	public int countOut() {
		return st.pop();
	}

	public DefaultCountingOutRhymer() {
		st = new IntArrayStack();
	}



}
