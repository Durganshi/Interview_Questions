package lambdaexamples;

import java.util.List;
import java.util.Optional;

public class NonRepeatedChar {
    public static void main(String[] args) {
        String string = "adadsrtysh";
        Optional<Character> nonRepeatedChar = string.chars().mapToObj(ch -> (char) ch).filter(ch -> string.indexOf(ch) == string.lastIndexOf(ch))
                .findAny();
        nonRepeatedChar.ifPresent(System.out::println);

    }
}
