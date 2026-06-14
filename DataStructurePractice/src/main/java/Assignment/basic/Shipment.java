package Assignment.basic;

import java.util.*;

/**
 * # warehouse has a shipment of packages, each labeled with an integer representing its weight.
 * The warehouse manager wants to organize these packages into groups such that:
 * # Each group contains exactly groupSize packages
 * # The weights within each group form a sequence of groupSize consecutive integers
 * # You are given an integer array weights, where weights[i] represents the
 * weight of the i-th package, and an integer groupSize.
 * # Return true if it is possible to rearrange all the packages into groups as described above. Otherwise, return false.
 * <p>
 * weights = [1, 2, 3, 6, 2, 3, 4, 7, 8]
 * groupSize = 3
 * Output:
 * true
 * <p>
 * weights = [1, 2, 3, 4, 5]
 * groupSize = 4
 * Output:
 * false
 * <p>
 * weights = [5, 1, 2, 6, 3, 4]
 * groupSize = 6
 * Output:
 * true
 * <p>
 * <p>
 * 1, 2, 3, 6, 2, 3, 4, 7, 8
 * 1,2,2,3,,3,4,6,7,8
 * <p>
 * 2,3,3,4,6,7,
 * [ 1,2]
 * 2,3,,3,4,6,7,8
 * remove
 * 3
 * 2,3,,4,6,7,8
 * 2
 * 2,3,
 * Start 1
 * 1,2,3
 * 9
 * group size 3
 * <p>
 * no of group 3
 * 1 - smallest
 * [ 1,2,3]
 * <p>
 * [2]
 * group2
 * [2,3,4,6,7,8]
 * remove 2
 * 3,4,6,7,8
 * 3
 * 4,6,7,8
 **/
public class Shipment {
    public static boolean canGroups(int[] nums, int groups) {
        if (nums.length % groups != 0) return false;

//
//        for(int n: nums){
//            list.add(n);
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(freq.keySet());

        Collections.sort(list);
        for (int x : list) {
            int count = freq.get(x);
            while (count > 0) {
                for (int i = 0; i < groups; i++) {
                    int req = x + i;

                    if (!freq.containsKey(req) || freq.get(req) <= 0) {
                        return false;
                    }
                    freq.put(req, freq.get(req) - 1);
                }
                count = freq.get(x);
            }

        }
        return true;
        }



    public static void main(String[] args) {
        int[] nums = {1,5};
        int groups = 2;
        System.out.println(canGroups(nums, groups));


    }
}
