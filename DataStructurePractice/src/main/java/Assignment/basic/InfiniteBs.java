package Assignment.basic;
//i/p: [0,0,0,1,1,1,....]
public class InfiniteBs {
    public static void main(String[] args) {
    
    }
    public static  int findFirstOne(int[]arr){

        int low = 0;
        int high =1;

        while(arr[high]==0){
            low = high;
            high = high *2;
        }
        int ans = -1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(arr[mid] ==1){
                ans = mid;
                high = mid-1;
            }
            else{
                low= mid+1;
            }
        }
        return ans;
    }
}
