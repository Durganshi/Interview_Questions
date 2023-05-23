package lambdaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(5, 2, 8, 3, 1);
        Collections.sort(num);
        System.out.println(num);
    }
}
