package lambdaexamples;

import java.util.Random;

public class RandomNum
{ public static void main(String[] args) {
        Random r = new Random();
        r.ints(10)
                .forEach(System.out::println);

        // random number btw 1 to 100
        r.ints(10, 1, 101)
                .forEach(System.out::println);

    }
}
