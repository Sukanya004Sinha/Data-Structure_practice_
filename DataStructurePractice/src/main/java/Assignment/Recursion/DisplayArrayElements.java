package Assignment.Recursion;

public class DisplayArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 2, 55, 12, 40, 3, 2, 50};

        //  displayArr(arr, 0);
        // displayArrReverse(arr, 0)
//        int max = maxOfArray(arr, 0);
//        System.out.println(max);
//        int findFirstIdx = findFirst(arr, 0, 2);
//        System.out.println(findFirstIdx);
//        int findFirstIdx1 = findFirstOptimized(arr, 0, 2);
//        System.out.println(findFirstIdx1);
//       int lastIndex= lastIndex(arr, 0, 3);
//        System.out.println(lastIndex);
        int[] allIndexes = allIndicesOfArray(arr, 2, 0, 0);

        for (int i : allIndexes) {
            System.out.print(i + " ");
        }
    }




    public static int displayArr(int[] arr, int idx) {
        if (idx == arr.length) {
            return idx;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);

        return idx;
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        displayArrReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }

    public static int maxOfArray(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int misa = maxOfArray(arr, idx + 1);
        if (misa > arr[idx]) {
            return misa;
        } else {
            return arr[idx];
        }
    }

    public static int findFirst(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        int fiisa = findFirst(arr, idx + 1, x);
        if (arr[idx] == x) {
            return idx;
        }
        return fiisa;
    }

    public static int findFirstOptimized(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        } else {
            int fiisa = findFirstOptimized(arr, idx + 1, x);
            return fiisa;
        }
    }
    public static int lastIndex(int[] arr, int idx, int target) {
        if (idx == arr.length) {
            return -1;
        }

        int liisa = lastIndex(arr, idx + 1, target);
        if (liisa != -1) {
            return liisa;
        }
           else if (arr[idx] == target) {
                return idx;
            } else {
                return -1;
            }
    }

    public static int[] allIndicesOfArray(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }
        if (idx == x) {
            int[] iarr = allIndicesOfArray(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndicesOfArray(arr, x, idx + 1, fsf);
            return iarr;
        }

    }
}
