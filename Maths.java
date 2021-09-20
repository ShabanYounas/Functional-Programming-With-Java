package com.company;
import java.util.function.BiFunction;
import java.io.LineNumberReader;
import java.util.function.BiFunction;

public class Maths {
    protected static class MyMaths{
        public static Integer add( Integer x, Integer y){
            return x + y;
        }
        public static Integer Subtract( Integer x, Integer y){
            return x - y;
        }
        public static Integer multiply( Integer x, Integer y){
            return x * y;
        }
        public static Integer combine2AND3(BiFunction<Integer, Integer, Integer>combineFunction){
        return combineFunction.apply(2,3);
        }
        public static void main(String[]args){
            System.out.println(MyMaths.combine2AND3(MyMaths::multiply));
            System.out.println(MyMaths.combine2AND3(MyMaths::add));
            System.out.println(MyMaths.combine2AND3(MyMaths::Subtract));
            System.out.println(MyMaths.combine2AND3((x, y) -> 2 * x + 8 * y ));
        }

    }
}
