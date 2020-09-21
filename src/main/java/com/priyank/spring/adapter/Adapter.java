package com.priyank.spring.adapter;

import java.util.Arrays;
import java.util.List;

public class Adapter {

    public static void main(String[] args) {
        Integer[] arrayOfInts = new Integer[] {42,43,55};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);
        System.out.println(arrayOfInts);
        System.out.println(listOfInts);
    }
}