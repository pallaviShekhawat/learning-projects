package StreamAPIs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Microservices","High Level Design","Kafka");
        String longestString = list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(longestString);
    }
}


