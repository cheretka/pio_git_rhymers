package edu.kis.vh.nursery.IntStosTypes;

import edu.kis.vh.nursery.IntStos;

public class IntArrayStack implements IntStos {


    private static final int EMPTY_RHYMER_FLAG = -1;
    private static final int MAX_NUMBERS_COUNT = 12;
    private final int[] numbers = new int[MAX_NUMBERS_COUNT];


    protected int total = EMPTY_RHYMER_FLAG;


    /**
     * jezeli tablica nie jest pelna, dodaje liczbe do tablicy
     * @param in liczba ktora zostanie dodana do tablicy
     */
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * funkcja zprawdza czy tablica jest pusta
     * @return true jezeli tablica jest pusta
     */
    public boolean isEmpty() {
        return total == EMPTY_RHYMER_FLAG;
    }

    /**
     * funkcja zprawdza czy tablica jest wypelniona
     * @return true jezeli tablica jest wypelniona
     */
    public boolean isFull() {
        return total == MAX_NUMBERS_COUNT -1;
    }

    /**
     * funkcja zwraca ostatnia liczbe w tablice
     * @return zwraca ostatnia liczbe w tablice
     */
    public int top() {
        if (isEmpty())
            return RETVAL;
        return numbers[total];
    }


    /**
     * funkcja zwraca ostatnia liczbe w tablice i usula ta liczbe z tablicy
     * @return zwraca ostatnia liczbe w tablice
     */
    public int pop() {
        if (isEmpty())
            return RETVAL;
        return numbers[total--];
    }

}
