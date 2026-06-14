package Assignment.prefixSum;

public class prefixSum {
    public static void main(String[] args){
        int[] arr = {6,4,5,-3,2,8};
        int[] res= prefix(arr);
        for(int a: res){
            System.out.println("Prefix Sum "+ a + " ");

        }
        int[] res1= suffix(arr);
        for (int a: res1){
            System.out.println("Suffix Sum " + a+ "");
        }
    }
    public static int[] prefix(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }

    public static int[] suffix(int[] arr){
        int[] suffixSum = new int[arr.length];
        suffixSum[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i+1]+arr[i];
        }
        return suffixSum;
    }
}
