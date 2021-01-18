package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int RETVAL = -1;
	private static final int EMPTY_RHYMER_FLAG = -1;
	private static final int MAX_NUMBERS_COUNT = 12;
	private final int[] numbers = new int[getMaxNumbersCount()];

	public static int getRETVAL() {
		return RETVAL;
	}

	public static int getEmptyRhymerFlag() {
		return EMPTY_RHYMER_FLAG;
	}

	public static int getMaxNumbersCount() {
		return MAX_NUMBERS_COUNT;
	}

	protected int getTotal() {
		return total;
	}

	protected int total = getEmptyRhymerFlag();

	protected void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
			return total == getEmptyRhymerFlag();
		}

			protected boolean isFull() {
				return total == getMaxNumbersCount() -1;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return getRETVAL();
					return numbers[total];
				}

					protected int countOut() {
						if (callCheck())
							return getRETVAL();
						return numbers[total--];
					}

}
