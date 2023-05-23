package lambdaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SuffixPrefix {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Audi", "Supra", "Lamborgini");
        List<String> newString = strings.stream().map(s -> "Prefix_" + s + "_Suffix").collect(Collectors.toList());
        System.out.println(newString);

    }
}
