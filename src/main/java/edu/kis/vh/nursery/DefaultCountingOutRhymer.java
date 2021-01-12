package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int RETVAL = -1;
	public static final int EMPTY_RHYMER_FLAG = -1;
	public static final int MAX_NUMBERS_COUNT = 12;
	private final int[] numbers = new int[MAX_NUMBERS_COUNT];

	public int total = EMPTY_RHYMER_FLAG;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		public boolean callCheck() {
			return total == EMPTY_RHYMER_FLAG;
		}
		
			public boolean isFull() {
				return total == MAX_NUMBERS_COUNT-1;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return RETVAL;
					return numbers[total];
				}
			
					public int countOut() {
						if (callCheck())
							return RETVAL;
						return numbers[total--];
					}

}
