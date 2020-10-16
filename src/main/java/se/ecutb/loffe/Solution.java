package se.ecutb.loffe;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Solution
{
    public static void main( String[] args )
    {
        fizzBuzz();

        List<Integer> list = List.of(3, 8, 6, 5, 5, 4, 9, 1, 12, 42, 8, 6, 1, 2, 4, 6, 42);
        System.out.println("List before removing doublets: " + list);
        System.out.println(removeDoublets(list));

        String toTranslate = "En jättelång mening med STORA bokstäver i också.";
        System.out.println(translateToRobberLanguage(toTranslate));

        String toTranslateToSwedish = "Enon jojätottotelolånongog momenoninongog momedod SosTotORorA bobokoksostotävoveror i ocockoksoså.";
        System.out.println(TranslateToSwedish(toTranslateToSwedish));
    }

    private static String TranslateToSwedish(String string) {
        String translated = "";
        for (int i = 0; i < string.length(); i++) {
            if (("bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ!".contains("" + string.charAt(i)))){
                translated = translated.concat("" + string.charAt(i));
                i += 2;
            } else {
                translated = translated.concat("" + string.charAt(i));
            }
        }
        return translated;
    }

    private static String translateToRobberLanguage(String string) {
        char[] charArrayToTranslate = string.toCharArray();
        String translated = "";

        for (char c : charArrayToTranslate) {
            if (c == 'b' || c == 'B' ||
                c == 'c' || c == 'C' ||
                c == 'd' || c == 'D' ||
                c == 'f' || c == 'F' ||
                c == 'g' || c == 'G' ||
                c == 'h' || c == 'H' ||
                c == 'j' || c == 'J' ||
                c == 'k' || c == 'K' ||
                c == 'l' || c == 'L' ||
                c == 'm' || c == 'M' ||
                c == 'n' || c == 'N' ||
                c == 'p' || c == 'P' ||
                c == 'q' || c == 'Q' ||
                c == 'r' || c == 'R' ||
                c == 's' || c == 'S' ||
                c == 't' || c == 'T' ||
                c == 'v' || c == 'V' ||
                c == 'w' || c == 'W' ||
                c == 'x' || c == 'X' ||
                c == 'z' || c == 'Z') {
                translated = translated.concat(c + "o" + String.valueOf(c).toLowerCase());
            } else {
                translated = translated.concat(c + "");
            }
        }
        return translated;
    }

    private static Set<Integer> removeDoublets(List<Integer> doublets) {
        return new LinkedHashSet<>(doublets);
    }

    private static void fizzBuzz(){
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
