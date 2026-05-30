package StreamAPIs;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10,20,40,30);
        int sum = number.stream()
                .mapToInt(Integer ::intValue)
                .sum();

        System.out.println("Sum of all numbers=" +sum );
    }
}
