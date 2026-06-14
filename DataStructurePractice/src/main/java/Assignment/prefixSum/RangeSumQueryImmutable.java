package Assignment.prefixSum;

public class RangeSumQueryImmutable {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
//        int ans = rangeSum(nums, 1, 2);
//        System.out.println(ans);
        int[][] queries = {
                {1, 2}, // Query 1: range 1 to 2
                {0, 2}, // Query 2: range 0 to 2
                {2, 5}  // Query 3: range 2 to 5
        };


            rangeSumOptimal(nums, queries);

    }

    public static int rangeSum(int[] arr, int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += arr[i];

        }
        return sum;
    }


    public static void rangeSumOptimal(int[] arr, int[][]queries) {
        int[]pf =  prefixInOptimal(arr);
        int q = queries.length;
        for(int i =0;i<q;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            if(l>0){
                int ans = pf[r]- pf[l-1];
                System.out.println(ans);
            }
            else{
                int ans = pf[r];
                System.out.println(ans);
            }
        }

    }
    public static int[] prefixInOptimal(int[] arr){
        int n = arr.length;
        int[] pf = new int[n];
        if(n==0) return pf;
        pf[0] = arr[0];
        for(int i =1;i<n;i++){
            pf[i]= pf[i-1]+arr[i];
        }
        return pf;
    }

}