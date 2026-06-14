package Assignment.Recursion;

import java.util.ArrayList;

public class RecursionArrayList {
    public static void main(String[] args) {

 int n = 3;
 int m =3;
 ArrayList<String> paths = getMazePaths(1,1,n,m);
        System.out.println(paths);
      //  String str = "473";
//        ArrayList<String> res =gss(str);
//        System.out.println(res);

//        ArrayList<String> res1 = getKPC(str);
//        System.out.println(res1);
        ArrayList<String> res1 = getStairsPaths(n);
        System.out.println(res1);


    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres) {
            mres.add("" + rstr);
        }
        for (String rstr: rres){
            mres.add(ch + rstr);
        }
        return mres;
    }
   static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

     public static ArrayList<String>getKPC(String str){
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

         char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres =getKPC(ros);
        ArrayList<String>mres = new ArrayList<>();
        String codesforch = codes[ch-'0'];
        for(int i =0;i<codesforch.length();i++) {
            char chcode=codesforch.charAt(i);
            for (String rstr : rres) {
                mres.add( chcode+ rstr);
            }
        }
        return mres;
    }
    public static ArrayList<String> getStairsPaths(int n){
         if(n==0){
             ArrayList<String> bres = new ArrayList<>();
             bres.add("");
             return bres;
         }
         else if(n<0){
             ArrayList<String> bres = new ArrayList<>();
             return  bres;
         }
         ArrayList<String> paths1= getStairsPaths(n-1);
         ArrayList<String> paths2 = getStairsPaths(n-2);
         ArrayList<String> paths3 = getStairsPaths(n-3);
         ArrayList<String> paths = new ArrayList<>();
         for(String path: paths1){
             paths.add(1+ path);
         }
         for (String path: paths2){
             paths.add(2+ path);
         }
         for (String path: paths3){
             paths.add(3+ path);
         }
         return paths;
    }
    public static ArrayList<String> getMazePaths(int sr,int sc,int dr, int dc){
         if(sr==dr && sc==dc){
             ArrayList<String> bres =new ArrayList<>();
             bres.add("");
             return bres;
         }
         ArrayList<String> hpaths =new ArrayList<>();
         ArrayList<String> vpaths = new ArrayList<>();
         if(sc<dc){
             hpaths= getMazePaths(sr, sc+1, dr, dc);
         }
        if(sr<dr){
            vpaths= getMazePaths(sr+1, sc, dr, dc);
        }
        ArrayList<String> paths =new ArrayList<>();
        for (String hpath: hpaths){
            paths.add("h"+ hpath);

        }
        for (String vpath: vpaths){
            paths.add("v"+ vpath);

        }
        return  paths;
    }
}
