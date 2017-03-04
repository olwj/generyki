package com.sdajava.generyki;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <E> void printArray(E[] inArray){

        for(E value: inArray)
        {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {

        Integer[] intArray = {1,2,3,4,5,6};
        Double[] doubleArray = {1.2, 3.4, 3.23, 45.23};
        Character[] charArray = {`c`,`z`,`e`,`s`,`c`};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);


    }
}
