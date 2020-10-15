package se.ecutb.loffe;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Solution
{
    public static void main( String[] args )
    {
        //fizzBuzz();

        List<Integer> list = List.of(3, 8, 6, 5, 5, 4, 9, 1, 12, 42, 8, 6, 1, 2, 4, 6, 42);
        System.out.println(removeDoublets(list));
    }

    private static Set<Integer> removeDoublets(List<Integer> doublets) {
        return new LinkedHashSet<>(doublets);
    }

    private static void fizzBuzz(){
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
