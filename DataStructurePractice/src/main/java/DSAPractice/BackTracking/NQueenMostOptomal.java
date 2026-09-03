package DSAPractice.BackTracking;

public class NQueenMostOptomal {
    // N-Queens Most optimized => O(1 + rec) space, canPlaceHere => O(1) time ==============================
    public int setKthBit(int num, int k){
        int mask = (1 << k);
        int newNum = num | mask;

        return newNum;
    }

    public int unsetKthBit(int num, int k){
        int mask = ~(1 << k);
        int newNum = num & mask;

        return newNum;
    }

    public boolean ifKthBitIsOn(int num, int k){
        int mask = (1 << k);

        int res = num & mask;
        return res > 0;
    }

    public int nQueensMostOptimized(int row, int colVis, int diagVis, int aDiagVis, int n){

            if (row == n) {
                return 1;
            }

            int count = 0;

            for (int col = 0; col < n; col++) {


                int diag = row - col + (n - 1);


                int aDiag = row + col;


                if (!ifKthBitIsOn(colVis, col)
                        && !ifKthBitIsOn(diagVis, diag)
                        && !ifKthBitIsOn(aDiagVis, aDiag)) {



                    colVis = setKthBit(colVis, col);
                    diagVis = setKthBit(diagVis, diag);
                    aDiagVis = setKthBit(aDiagVis, aDiag);

                    count += nQueensMostOptimized(
                            row + 1,
                            colVis,
                            diagVis,
                            aDiagVis,
                            n
                    );

                    colVis = unsetKthBit(colVis, col);
                    diagVis = unsetKthBit(diagVis, diag);
                    aDiagVis = unsetKthBit(aDiagVis, aDiag);
                }
            }




            return count;
        }
    public int totalNQueens(int n) {
        int colVis = 0;
        int diagVis = 0;
        int aDiagVis = 0;

        return nQueensMostOptimized(0,colVis,diagVis,aDiagVis,n);
    }
}
