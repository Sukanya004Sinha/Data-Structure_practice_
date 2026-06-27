package Assignment.basic;

/**
 *
 There are N poles of various heights, and you have a machine whose saw blade can be set at a specific height "h" and it cuts all poles till that height, such that all of them have height "h" after the cut. (Poles with height less than "h" remain uncut). You take away the cut portions of all poles with you. Your task is to take at least M length of poles with you in total after the cut. What is the maximum height 'h' where you can set your blade to achieve this.
 M > 0

 Example:


 N = 4
 M = 7
 arr = [20, 15, 10, 17]
 Ans: H = 15

 N = 3
 M = 10
 arr = [10, 20, 30]
 Ans: H = 20

 N = 3
 M = 100
 arr = [5, 8, 6]
 Ans: H=0

 */
public class MaximumCuts {

    public static  void main(String[] args) {
        int[] arr= {5, 8, 6};
        int m=100;
        System.out.println(maximumCuts(arr,m));
    }
        public static int maximumCuts(int[]arr,int m ){
        int low = 0;
        int high= 0;
        for(int height:  arr){
            high = Math.max(high,height);

        }
        int res = 0;
        while(low<=high){
            int mid = (low+high)/2;
            int woodPortion = 0;

            for(int height : arr){
                if(height>mid){
                    woodPortion +=(height-mid);

                }
            }
            if(woodPortion>= m){
                res =mid;
                 low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
            return  res;


    }
}
