package mcdodik;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Integer> input = List.of(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> output = countElements(input);
        System.out.println(output);
    }

    public static Map<Integer, Integer> countElements(List<Integer> elements) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer element : elements) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        return result;
    }
}