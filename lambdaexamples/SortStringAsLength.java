package lambdaexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringAsLength {
    public static void main(String[] args) {

        List<String> str= Arrays.asList("durganshi","choudhary","fullstack","developer");
        str.sort(Comparator.comparingInt(String::length));
        System.out.println(str);

    }
}
