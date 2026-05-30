package StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java" ,"python","Java","scala","SQL","scala","pyspark");

        Map<String ,Long> wordCountMap = words.stream()
                .collect(Collectors.groupingBy(word -> word,Collectors.counting()));

        System.out.println(wordCountMap);
    }
}
