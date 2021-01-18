package edu.kis.vh.nursery;


/**
 * DefaultCountingOutRhymer - klasa zawierajca tablice liczb, i pozwalajaca na modyfikacje tej tablicy
 */

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
	public int getTotal() {
		return total;
	}

	protected int total = getEmptyRhymerFlag();


	/**
	 * jezeli tablica nie jest pelna, dodaje liczbe do tablicy
	 * @param in liczba ktora zostanie dodana do tablicy
	 */
	protected void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * funkcja zprawdza czy tablica jest pusta
	 * @return true jezeli tablica jest pusta
	 */
	protected boolean callCheck() {
		return total == getEmptyRhymerFlag();
	}

	/**
	 * funkcja zprawdza czy tablica jest wypelniona
	 * @return true jezeli tablica jest wypelniona
	 */
	protected boolean isFull() {
		return total == getMaxNumbersCount() -1;
	}

	/**
	 * funkcja zwraca ostatnia liczbe w tablice
	 * @return zwraca ostatnia liczbe w tablice
	 */
	protected int peekaboo() {
		if (callCheck())
			return getRETVAL();
		return numbers[total];
	}


	/**
	 * funkcja zwraca ostatnia liczbe w tablice i usula ta liczbe z tablicy
	 * @return zwraca ostatnia liczbe w tablice
	 */
	protected int countOut() {
		if (callCheck())
			return getRETVAL();
		return numbers[total--];
	}

}
