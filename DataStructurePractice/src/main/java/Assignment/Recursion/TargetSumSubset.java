package Assignment.Recursion;

public class TargetSumSubset {

    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 8, 10};
        int target = 11;

        targetSumSubset(0, arr, target, 0, "");
    }

    public static void targetSumSubset(int idx, int[] arr, int target,
                                       int currSum, String asf) {


        if (idx == arr.length) {

            if (currSum == target) {
                System.out.println(asf);
            }

            return;
        }


        if (currSum > target) {
            return;
        }


        targetSumSubset(idx + 1, arr, target,
                currSum + arr[idx], asf + arr[idx] + " ");


        targetSumSubset(idx + 1, arr, target,
                currSum, asf);
    }
}