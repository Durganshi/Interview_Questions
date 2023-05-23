package lambdaexamples;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {
    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(4, 2, 7, 1, 5);
        int sum = num.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

    }
}
