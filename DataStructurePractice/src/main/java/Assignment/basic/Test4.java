package Assignment.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of candidate numbers (candidates)
 * and a target number (target), find all unique combinations in candidates
 * where the candidate numbers sum to target.
 * Each number in candidates may only be used once in the combination.
 * Note: The solution set must not contain duplicate combinations.
 * <p>
 * Example 1:
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output:
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        allPossibleCombination(arr, target);

    }

    public static void allPossibleCombination(int[] arr, int target) {
        List<List<Integer>> res=  new ArrayList<>();

        Arrays.sort(arr);
        backtrack(arr, target, 0, new ArrayList<>(), res);
        System.out.println(res);


    }

    public static void backtrack(int[] candidates, int target, int start, List<Integer> temp, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;

        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;

            }
            if (candidates[i] > target) {
                break;
            }
            temp.add(candidates[i]);
            backtrack(candidates, target-candidates[i], i+1, temp, res);
            temp.remove(temp.size() - 1);


        }

    }
}
