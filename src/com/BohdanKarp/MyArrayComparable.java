package com.BohdanKarp;

import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

public class MyArrayComparable<T extends Comparable> {

    private T[] array;

    @SuppressWarnings("unchecked")
    public MyArrayComparable(){
        array=(T[]) new Object[0];
    }

    public void add(T element) {
      array= Arrays.copyOf(array,array.length+1);
      array[array.length-1]=element;

    }

    public T largest() {
        return Arrays.stream(array).min(Collections.reverseOrder()).orElseThrow(() -> new NoSuchElementException("Array empty"));
    }

    public T smallest() {
        return Arrays.stream(array).min(Collections.reverseOrder()).orElseThrow(() -> new NoSuchElementException("Array empty"));
    }

    @Override
    public String toString() {
        return "My Array: ";//+array.toString();
    }
}
