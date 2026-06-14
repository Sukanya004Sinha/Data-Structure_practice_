package Assignment;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Sukanya";
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
 left++;
 right--;
        }

    }
}
