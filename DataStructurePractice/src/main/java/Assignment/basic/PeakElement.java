package Assignment.basic;

/**
 * altitudes = [100, 250, 300, 120]
 * Output: 2
 */
public class PeakElement {
    public static void main(String[] args) {
    int[] arr = {50, 80, 70, 150, 400, 450, 200};
    int peakElement = findPeak(arr);
        System.out.println("Peak Element is " + peakElement);

    }
    public static  int findPeak(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low<high){
            int mid = (low+high)/2;

            if(arr[mid] < arr[mid+1]){
                low= mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}
