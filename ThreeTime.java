package com.company;
import java.util.function.Function;
public class ThreeTime {
    protected static class threeTime {
        public static Integer ThreeeTimes(Integer x){
            return x * 3;
        }
        public static void main(String[] args) {
            // write your code here
            Function<Integer, Integer> mythreeee = threeTime::ThreeeTimes;
            Integer rslt= mythreeee.apply(5);
            System.out.println(rslt);


        }



    }
}
