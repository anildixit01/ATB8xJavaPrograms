package Nov2024;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementFrequency {
    public static void main(String[] args) {

// Sample array
        int[] arr = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

        // Create a HashMap to store element-frequency pairs
        Map<Integer, Integer> frequencyMap = new HashMap();

        // Count the frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each element
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
