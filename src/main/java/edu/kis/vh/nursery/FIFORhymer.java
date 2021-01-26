package edu.kis.vh.nursery;

import edu.kis.vh.nursery.IntStosTypes.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	final public IntArrayStack temp;

	public FIFORhymer() {
		temp = new IntArrayStack();
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
			countIn(temp.pop());
		
		return ret;
	}
}
