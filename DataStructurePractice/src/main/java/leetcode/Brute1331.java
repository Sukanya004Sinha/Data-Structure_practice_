package leetcode;

import java.util.Arrays;

public class Brute1331 {
        public static int[] arrayRankTransform(int[] arr) {
            int n = arr.length;
            int[] ans = new int [n];
            boolean[] visited = new boolean [n];

            int rank = 1;
            while(true){
                int min = findMin(arr,visited);

                if (min == Integer.MAX_VALUE) {
                    break;
                }
                for(int i =0;i<n;i++){
                    if(!visited[i]&& arr[i]==min){
                        ans[i] =rank;
                        visited[i] = true;
                    }
                }
                rank++;
            }
            return ans;
        }


    public static int findMin(int[] arr, boolean[] visited) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i] && arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
       int[] arr = new int[]{40, 10, 20, 30};

        System.out.println(Arrays.toString(arrayRankTransform(arr)));

    }

    }

