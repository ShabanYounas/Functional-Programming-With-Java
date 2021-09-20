package com.company;
import java.util.Scanner;
import java.util.function.Function;
import java.util.Scanner;
public class Main {
    protected static class Doubleee
    {

        public static Integer Doubble (Integer x){
            return x * 2;
    }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Function<Integer,Integer> newMath = Doubleee::Doubble;

        Integer result = newMath.apply(scanner.nextInt());
        System.out.println(" The result is "  +  result);

        scanner.close();
        }


    }

