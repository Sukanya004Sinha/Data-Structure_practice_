package DSAPractice.Arrays;

public class ArrayImplementation {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50, 0}; // 1 extra space
        int size = 4;

        //   size = insertAtAnyPos(arr, size, 2, 30);
        //  size = delete(arr, size, 2);
        // update(arr,size, 2 , 45);
        System.out.println(search(arr, size, 40));

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int insertAtAnyPos(int[] arr, int size, int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return size;
        }
        if (size == arr.length) {
            System.out.println("Array is Full");
            return size;
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];

        }
        arr[index] = value;
        return size + 1;
    }


    public static int delete(int[] arr, int size, int index, int val) {
        if (size == 0) {
            System.out.println("Array is empty");
            return size;
        }
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return size;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return size - 1;
    }


public static int[] insert(int[] arr, int size, int index, int val) {
    if (index < 0 || index > size) {
        System.out.println("Invalid Index");
        return arr;
    }

        int [] newArr = new int [arr.length+1];
        for(int i =0;i<index;i++){
            newArr[i] = arr[i];
        }
        newArr[index] = val;
        for (int i =index;i<size;i++){
            newArr[i+1] = arr[i];
        }
        return newArr;
}
    public static int delete(int[] arr, int size, int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return size;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return size - 1;
    }
    public static int deleteLast(int[] arr, int size){
        if(size==0){
            System.out.println("Array is Empty");
            return size;
        }
        return size-1;
    }

    public static void update(int[] arr, int size, int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return;
        }
        arr[index] = value;
    }
    public static void updates(int[]arr,int size,int index,int value){
        if(index<0|| index>=size){
            System.out.println("Invalid Index");
            return;
        }
        arr[index]= value;
    }
    public static int search(int[]arr,int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }

        }
        return -1;
    }

    public static int search(int[] arr, int size, int x){
       for (int i =0;i<size;i++){
           if(arr[i]==x){
               return i;

           }

       }
       return -1;
    }
}