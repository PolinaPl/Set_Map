import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1(nums);
        System.out.println("Задание 2");
        task2(nums);
        System.out.println("Задание 3");
        task3(strings);
        System.out.println("Задание 4");
        task4(strings);
    }

    private static void task1(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    private static void task2(List<Integer> nums) {
        nums = new ArrayList<>(new HashSet<>(nums));
        Collections.sort(nums);
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    private static void task3(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    private static void task4(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        System.out.println(wordsMap);
    }
}
