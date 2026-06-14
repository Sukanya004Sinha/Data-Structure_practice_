package Assignment.prefixSum;

public class SplitEqualSum {
    public static boolean canSplitEqualSumBrute(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int lefSum = 0;

            for(int j=0;j<arr.length; j++){
                lefSum+= arr[j];
            }
            int rightSum = 0;
            for(int j=i+1;j<arr.length; j++){
                rightSum+= arr[j];
            }
            if(lefSum==rightSum){
                return  true;
            }


        }
        return false;
    }
    public static boolean canSplitEqualSum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
            int leftSum = 0;
            for(int j=0;j<arr.length-1;j++){

                leftSum += arr[j];

                if(leftSum == total-leftSum){
                    return true;
                }
            }


        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,-100};
        System.out.println(canSplitEqualSumBrute(arr));
        System.out.println(canSplitEqualSum(arr));
    }
}
