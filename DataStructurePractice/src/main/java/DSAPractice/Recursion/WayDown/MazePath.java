//package DSAPractice.Recursion.WayDown;
//
//public class MazePath {
//
//
//        public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
//
//            if (sr == dr && sc == dc) {
//                System.out.print(psf + " , ");
//                return;
//            }
//
//
//            if (sc < dc) {
//                printMazePaths(sr, sc + 1, dr, dc, psf + "h");
//            }
//
//
//            if (sr < dr) {
//                printMazePaths(sr + 1, sc, dr, dc, psf + "v");
//            }
//        }
//
//
