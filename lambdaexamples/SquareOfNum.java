package lambdaexamples;

import java.util.Arrays;
import java.util.List;

public class SquareOfNum {
    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(1, 2, 3, 4, 5);
        num.stream().map(n -> n * n).forEach(System.out::println);

    }
}
