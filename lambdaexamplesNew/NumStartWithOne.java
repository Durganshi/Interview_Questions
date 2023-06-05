package lambdaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStartWithOne {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(111,345,32,0,67,165);
        List<Integer> integerStartingWithOne = num.stream().filter(n -> String.valueOf(n).startsWith("1"))
                        .collect(Collectors.toList());

        System.out.println(integerStartingWithOne);

    }
}
