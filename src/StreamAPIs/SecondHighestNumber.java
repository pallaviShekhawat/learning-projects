package StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,15,35,10);

        Optional<Integer> secondHighest =numbers.stream()
                .distinct() //{10,20,30,15,35}
                .sorted((a ,b) ->b - a)//{10,15,20,30,35}

                .skip(1) //skip kiya 35 wala
                .findFirst(); // 30

        System.out.println("Second Highest Number " +secondHighest);

     }
}
