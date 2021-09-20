package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class mapingInJava {
    public static void main (String[]args){
        /*Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 19, 20, 31, 36};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

       /* List<Integer> doubbled = new ArrayList<>();
        for (int i = 0 ; i < listOfIntegers.size(); i++);
        Integer result = listOfIntegers.get( i )*2;
        doubbled.add(result);*/
        /*Function< Integer, Integer> timesTwo = (x) -> x * 3;
        List<Integer> doubbled = listOfIntegers.stream().map(timesTwo).collect(Collectors.toList());
        System.out.println(doubbled);

        // just the even numbers
        List<Integer> evenNumber = new ArrayList<>();
        for (int i = 0; i < listOfIntegers.size(); i++){
            Boolean isEven = listOfIntegers.get(i)%2 == 0;
        if (isEven){
            evenNumber.add((listOfIntegers.get(i)));

            Predicate<Integer> Even = (x) -> x % 2 == 0;

            listOfIntegers.stream().filter(Even).collect(Collectors.toList());
            System.out.println(evenNumber);
        }
        }*/
        String [] wordsArr  = {"hello", "my", "name", "is", "Shaban","Oragnger", "organic" };
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        Predicate<String > isLongerThan5 = (str) -> str.length() > 5;
        List<String > longWords = words.stream().map(String::toUpperCase).filter(isLongerThan5).collect(Collectors.toList());
        System.out.println(longWords);
        //test for reading a letter via scanner,
        // count the words that are similer
        // put the word in a table and sort them alphabetically.
        // count the words thay are longer then 6 character
        // do a total count of the words
        //
        // save it as a document on
        // the folder
        // publish it on linkedinn and github.
    }
}
