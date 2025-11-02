// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        Arrays.sort(nums);
        int first = nums[0];
        int last = nums[nums.length - 1];

        return last - first;
    }
    

    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    public static String LongestWordWithCharacter(ArrayList<String> words, char c) {
        // TODO: implement this
        String LongestWord = "";
        for (String word : words ) {
            char firstletter = word.charAt(0);
            if (firstletter == c && word.length() > LongestWord.length()) {
                LongestWord = word;
            }
        }
        return LongestWord;
    }

    public static int CountWordsBetweenNM(Set<String> words, int n, int m) {
        int count = 0;
        for (String word : words) {
            int lengthword = word.length();
            if (lengthword > n && lengthword < m) {
                count++;
            }
        }
        return count;
    }

    public static int DifferenceOddEven(Map<Integer, String> map) {
        int total = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            if (key % 2 == 0) {
                total++;
            } else {
                total--;
            }
        }
        
        return Math.abs(total);
    }



    public static void main(String[] args) {
        int[] numbers = {8, -2, 9, -5};
        System.out.println(maxDiff(numbers));
    }
}