package DSAPractice.TwoDArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralTraversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(spiralOrder(arr));
    }



        public static List<Integer> spiralOrder(int[][] arr) {
            List<Integer> ans = new ArrayList<>();

            int sr = 0;
            int sc = 0;
            int er = arr.length - 1;
            int ec = arr[0].length - 1;

            while (sr <= er && sc <= ec) {
                //left wall
                for(int col = sc, row =sr;row<=er;row++){
                    ans.add(arr[row][col]);

                }
                sc++;
                for(int row =er,col=sc; col<=ec; col++){
                    ans.add(arr[row][col]);

                }
                er--;
                //right wall
                for(int col= ec,row =er; row>=sr; row--){
                    ans.add(arr[row][col]);

                }
                ec--;

                // top
                for (int row=sr,col=ec;col>=sc; col--){
                    ans.add(arr[row][col]);


                }
                sr++;

            }


        return ans;
    }
}