package StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(2,3,4),
                Arrays.asList(1,2),
                Arrays.asList(6,7,5));

        List<Integer> flatList = numbers.stream()
                .flatMap(list ->list.stream())
                .collect(Collectors.toList());

        System.out.println(flatList);
    }
}
