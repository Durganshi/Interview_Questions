package lambdaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntPerCount {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(4,3,6,4,7,3,0,1,2,4,2);
        num.sort(Comparator.comparingInt(i -> Collections.frequency(num, i)));
        List<Integer> result = num.stream().distinct().collect(Collectors.toList());
        System.out.println(result);

    }
}