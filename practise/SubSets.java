package practise;
import java.util.*;

public class SubSets {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        AllSubsets(result);

    }

    public static ArrayList<ArrayList<Integer>> AllSubsets(ArrayList<Integer> nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(nums); // Sort the array to ensure lexicographically sorted subsequences
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(ArrayList<Integer> nums, int start, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        result.add(new ArrayList<>(current));
        System.out.println(current);

        for (int i = start; i < nums.size(); i++) {
            if (i > start && nums.get(i).equals(nums.get(i - 1))) {
                continue; // Skip duplicates to avoid duplicate subsequences
            }
            current.add(nums.get(i));
            backtrack(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
