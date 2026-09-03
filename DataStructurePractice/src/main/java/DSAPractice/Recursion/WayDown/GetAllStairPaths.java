package DSAPractice.Recursion.WayDown;

import java.util.ArrayList;

public class GetAllStairPaths {
    public static void main(String[] args) {
        System.out.println(getStairPaths(4));
    }
    public static ArrayList<String> getStairPaths(int n){
        if(n==0){
            ArrayList<String> bans = new ArrayList<>();
           bans.add("");
            return  bans;
        }
        else if(n<0){
            ArrayList<String> bans = new ArrayList<>();

            return  bans;
        }
        ArrayList<String>  onePathSteps= getStairPaths(n-1);
        ArrayList<String> twoPathSteps = getStairPaths(n-2);
        ArrayList<String> threePathSteps = getStairPaths(n-3);
        ArrayList<String> allPaths = new ArrayList<>();
        for(String path: onePathSteps) {
            allPaths.add(1 + path);
        }
        for(String path: twoPathSteps) {
            allPaths.add(2 + path);
        }
        for(String path: threePathSteps) {
            allPaths.add(3+ path);

        }
        return allPaths;
    }
}
