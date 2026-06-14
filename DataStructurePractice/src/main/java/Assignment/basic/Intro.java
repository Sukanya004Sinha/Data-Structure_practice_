package Assignment.basic;

/*
Print numbers from 1 to 10
 */
public class Intro {
    public static void main(String[] args) {
       // print(10);
      //  System.out.println(largest(10, 20));
    //    int[] arr={1, 2, 3, 4, 9,5};
     //   SumOfAllNumbers(arr);
      //  maximum(arr);
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(reverseString("GyanSukanya"));

    }
    public static void print(int n ){
        for (int i =1;i<=n;i++){
            System.out.println(i);
        }
    }
//    Find the largest of two numbers
    public static int largest (int n1, int n2){
        if(n1>n2)
        {
            return n1;
        }
        else {
            return n2;
        }
    }
    //Find the sum of all numbers in an array
    public static void SumOfAllNumbers(int[] arr){
        int sum = 0;
        for (int i =0;i<arr.length;i++){
            sum+=arr[i];

        }
        System.out.println(sum);
    }
    //Find the maximum element in an array
    public static void maximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i =0;i<arr.length;i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
            System.out.print(max);

    }
    //Reverse an array
    public static void reverse(int[] arr){
       int left = 0;
       int right = arr.length-1;
       while(left<right){
           int temp = arr[left];
           arr[left]=arr[right];
           arr[right] =temp;
           left++;
           right--;
       }


    }
    public static String reverseString(String str){
        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            char temp = chars[left];
            chars[left]=chars[right];
            chars[right] =temp;
            left++;
            right--;
        }
        return new String(chars);
    }

}
