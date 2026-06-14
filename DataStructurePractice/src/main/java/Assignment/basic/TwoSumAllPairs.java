package Assignment.basic;

import java.util.*;

//nums = [1, 2, 3, 4, 5]
//target = 5
public class TwoSumAllPairs {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5,5,1};
        int target = 5;
//        int[][] res = allTwoSum(nums, target);
//        for (int[] pair : res) {
//            System.out.println(Arrays.toString(pair));
//        }
      //  System.out.println(Arrays.toString(twoSum(nums, target)));
        List<int[]> res  = twoSums(nums, target);
        for(int[] pair :res){
            System.out.println(Arrays.toString(pair));

        }
    }
    public static int[][] allTwoSum(int[] nums, int target){
        List<int[]> pairs = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]+nums[j]==target){
                    pairs.add(new int[]{i,j});
                }
            }
        }

        int[][] res = new int[pairs.size()][2];
        for(int k=0;k<pairs.size();k++){
            res[k] = pairs.get(k);
        }
        return res;
    }
   public static List<int[]> twoSums(int[] nums, int target) {
       List<int[]> pairs = new ArrayList<>();
       Map<Integer, List<Integer>> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
           int complement = target - nums[i];
           if (map.containsKey(complement)) {
               for (int index : map.get(complement)) {
                   pairs.add(new int[]{index, i});
               }
           }
               if (!map.containsKey(nums[i])) {
                   map.put(nums[i], new ArrayList<>());
               }
           map.get(nums[i]).add(i);
       }

       return pairs;
   }


          // map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
//       }
//
//
//    return pairs;
//}
public static int[]  twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i =0;i< nums.length;i++){
       int complement =  target-nums[i];
       if(map.containsKey(complement)){
           return new int[]{map.get(complement),i};
       }
       map.put(nums[i], i);
    }
    return new int[]{};
}

}
