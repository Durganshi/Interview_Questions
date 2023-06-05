package lambdaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SortList {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(11,32,65,87,3,0,54);
        Collections.sort(num);
        System.out.println(num);
    }
}
