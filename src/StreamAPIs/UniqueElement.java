package StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElement {
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(1,1,1,1,1,2,2,2,2,3,4,5,5,6,7,8,8);

        List<Integer> uniqueNumbers = elements.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNumbers);
    }
}
