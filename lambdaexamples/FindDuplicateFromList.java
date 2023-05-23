package lambdaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateFromList {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList( 29, 832, 23, 55, 11,55, 98);
        List<Integer> duplicates = num.stream()
                .filter(n-> Collections.frequency(num, n) > 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(duplicates);

    }
}
