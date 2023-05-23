package lambdaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxInList {
    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(54,34,65,0,12,1);
        Optional<Integer> max = num.stream()
                .max(Integer::compareTo); // (a, b) -> a.compareTo(b)
        max.ifPresent(System.out::println); //max.ifPresent(num -> System.out.println(num));

    }

    public static class JoinTwoStream {
        public static void main(String[] args) {

            Stream<Integer> s1 = Stream.of(10,20,30);
            Stream<Integer> s2 = Stream.of(4, 5, 6);
            Stream<Integer> concatenatedStream = Stream.concat(s1, s2);
            concatenatedStream.forEach(System.out::println);

        }
    }
}
