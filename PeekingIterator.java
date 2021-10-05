package com.bsc.leetcode;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer>{
    private Integer nextElem;
    private Iterator<Integer> iterator;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        nextElem = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextElem;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer ret = nextElem;
        nextElem = iterator.hasNext()? iterator.next() : null;
        return ret;
    }

    @Override
    public boolean hasNext() {
        return nextElem!=null;
    }
}
