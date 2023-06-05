package lambdaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
public class MaxInList {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(54,34,65,0,12,1);
        Optional<Integer> max = num.stream()
                .max(Integer::compareTo);
        max.ifPresent(System.out::println);
    }
    public static class JoinTwoStream {
        public static void main(String[] args) {
            Stream<Integer> s1 = Stream.of(55,1,32);
            Stream<Integer> s2 = Stream.of(44, 21, 11);
            Stream<Integer> concatenatedStream = Stream.concat(s1, s2);
            concatenatedStream.forEach(System.out::println);
        }
    }
}
