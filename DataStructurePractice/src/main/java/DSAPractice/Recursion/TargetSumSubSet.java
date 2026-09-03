package DSAPractice.Recursion;

public class TargetSumSubSet {

    public static void main(String[] args) {

        int[] nums = {2, 3, 7, 8, 10};
        int target = 11;

        System.out.println(targetSum(nums, 0, target));
    }

    public static boolean targetSum(int[] nums, int index, int target) {


        if (target == 0) {
            return true;
        }


        if (index == nums.length) {
            return false;
        }


        boolean take = targetSum(
                nums,
                index + 1,
                target - nums[index]
        );

        boolean notTake = targetSum(
                nums,
                index + 1,
                target
        );

        return take || notTake;
    }
}