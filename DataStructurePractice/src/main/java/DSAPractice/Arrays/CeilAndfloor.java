package DSAPractice.Arrays;

public class CeilAndfloor {
    public static void ceilAndFloorproblem(int[] arr,int x){
        int ceil = Integer.MIN_VALUE;
        int floor= Integer.MAX_VALUE;
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid =(left+right)/2;
            if(arr[mid]== x){
                floor= arr[mid];
                ceil=arr[mid];
                break;
            }
            else if(arr[mid]<x){
                floor= arr[mid];
                left=mid+1;
            }

            else{
                ceil=arr[mid];
                right=mid-1;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }

    public static void main(String[] args) {
        int [] arr= new int[] {10,20,30,40,50};
        int x= 30;
        ceilAndFloorproblem(arr,x);
    }
}
