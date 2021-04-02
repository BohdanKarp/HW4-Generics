package com.BohdanKarp;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add((Integer) 1);
        myList.add((Integer) 2);
        myList.add((Integer) 3);
        System.out.println(myList.toString());
        System.out.println(myList.smallest());
        System.out.println(myList.largest());
        MyListComparable<Integer> myListComparable = new MyListComparable<>();
        myListComparable.add((Integer) 1);
        myListComparable.add((Integer) 2);
        myListComparable.add((Integer) 3);
        System.out.println(myListComparable.toString());
        System.out.println(myListComparable.smallest());
        System.out.println(myListComparable.largest());
        MyListComparable<String> myListComparableString = new MyListComparable<>();
        myListComparableString.add("1");
        myListComparableString.add("2");
        myListComparableString.add("3");
        System.out.println(myListComparableString.toString());
        System.out.println(myListComparableString.smallest());
        System.out.println(myListComparableString.largest());
        //MyArrayComparable<Integer>myArrayComparable = new MyArrayComparable<Integer>();
        //myArrayComparable.add(1);
        //myArrayComparable.add(2);
        //myArrayComparable.add(3);
        //System.out.println(myArrayComparable.toString());
        //System.out.println(myArrayComparable.smallest());
        //System.out.println(myArrayComparable.largest());
    }
}
