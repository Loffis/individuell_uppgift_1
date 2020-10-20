package se.ecutb.loffe;

import java.util.LinkedHashSet;
import java.util.List;

public class Solution
{
    public static void main( String[] args )
    {

        fizzBuzz();

        List<Integer> list = List.of(3, 8, 6, 5, 5, 4, 9, 1, 12, 42, 8, 6, 1, 2, 4, 6, 42);
        System.out.println("\n" + removeDoublets(list) + "\n");

        String swedishString = "Hej på dig!";
        System.out.println(translateToRobberLanguage(swedishString));

        String robberLangString = "Enon jojätottotelolånongog momenoninongog momedod SosTotORorA bobokoksostotävoveror i ocockoksoså.";
        System.out.println(TranslateToSwedish(robberLangString) + "\n");

        System.out.println("whatSquare output: " + whatSquare(64));
    }

    // Riskorn
    private static int whatSquare(double input) {
        if (input == 0 ) {
            return 0;
        }
        double rice;
        double sum = 0;
        for (int i = 0; i < 64; i++) {
            rice = Math.pow(2, i);
            sum += rice;
            if (input <= sum) {
                return i + 1;
            }
        }
        return 0;
    }

    // Rövarspråket 2
    private static String TranslateToSwedish(String string) {
        String translated = "";
        for (int i = 0; i < string.length(); i++) {
            if (("bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ".contains("" + string.charAt(i)))){
                translated = translated.concat("" + string.charAt(i));
                i += 2;
            } else {
                translated = translated.concat("" + string.charAt(i));
            }
        }
        return translated;
    }

    // Rövarspråket
    private static String translateToRobberLanguage(String string) {
        String translated = "";

        for (int i = 0; i < string.length(); i++) {
            if (("bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ".contains("" + string.charAt(i)))) {
                translated = translated.concat(string.charAt(i) + "o" + (string.charAt(i) + "").toLowerCase());
            } else {
                translated = translated.concat(string.charAt(i) + "");
                
            }
        }
        return translated;
    }

    // Dublett
    private static LinkedHashSet<Integer> removeDoublets(List<Integer> doublets) {
        return new LinkedHashSet<>(doublets);
    }

    // FizzBuzz
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
