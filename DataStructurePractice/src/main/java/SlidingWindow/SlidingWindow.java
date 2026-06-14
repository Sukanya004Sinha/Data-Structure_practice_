package SlidingWindow;

import java.util.*;

//Input: arr[] = [3,4,7,2,6,9] , k = 2
//Output: [-8, 0, -6, -6];


public class SlidingWindow {
    public static void main(String[] args) {
//        int[] arr = {-8, 2, 3, -6, 10};
//        int k = 2;
//        int[] arr = {1,3,-1,-3,5,3,6,7};
//        int k = 3;
        //Output: [3, 4, 4, 3]
//        String  str ="cbaebabacd";
//                String p = "abc";
//        System.out.println(countOccurences(str, p));
        //  System.out.println(solve(arr, k));
      //  System.out.println(countDistinct(arr, k));
       // System.out.println(findSum(arr, k));
        SlidingWindow sol = new SlidingWindow();
        System.out.println(sol.findRadius(new int[]{1, 2, 3}, new int[]{2})); // Output: 1
        System.out.println(sol.findRadius(new int[]{1, 5}, new int[]{2}));    // Output: 3
//        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }

    /**
     * arr= [3,4,7,2,6,9]
     * k=3
     * Output [0]= 3+4+7
     * Output[1]=4+7+2
     * Output[2]= 7+2+6
     * Output[3] = 2+6+9
     * <p>
     * <p>
     * Ans = [14, 13, 15, 17]
     *
     * @param arr
     * @param k
     * @return
     */
    public static List<Integer> findSum(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        int sum = 0;
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 == k) {
                ans.add(sum);
                sum -= arr[i];
                i++;
            }
            j++;


        }
        return ans;

    }

    public static List<Integer> solve(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        Queue<Integer> findFirst = new ArrayDeque<>();
        while (j < arr.length) {
            if (arr[j] < 0) {   //calculation
                findFirst.add(arr[j]);
            }

            if (j - i + 1 == k) {  //window size
                if (findFirst.isEmpty()) {   //Derived ans
                    ans.add(0);  //
                } else {
                    ans.add(findFirst.peek());
                }

                if (!findFirst.isEmpty() && arr[i] == findFirst.peek()) {
                    findFirst.remove();   //removing i calc

                }
                i++; // increasing i to make sure that its now pointig on next window

            }
            j++; //


        }
        return ans;

    }

    //    arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4
//    Output: [3, 4, 4, 3]
//    Count Distinct Elements In Every Window of Size K
    public static List<Integer> countDistinct(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        //   Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> fmap = new HashMap<>();
        while (j < arr.length) {
            fmap.put(arr[j], fmap.getOrDefault(arr[j], 0) + 1);
            if (j - i + 1 == k) {
                ans.add(fmap.size());
                if (fmap.containsKey(arr[i])) {
                    int count = fmap.get(arr[i]);
                    count--;
                    if (count == 0) {
                        fmap.remove(arr[i]);
                    } else {
                        fmap.put(arr[i], count);   //update here // {1,1,1,2,3,4} k=4
                    }

                }
                i++;

            }
            j++;

        }


        return ans;
    }

        public static int countOfOccurences(String txt, String pat) {
        int n = txt.length();
        int k = pat.length();

      Map<Character, Integer> patMap = new HashMap<>();
      for(char c:pat.toCharArray()){
          patMap.put(c,patMap.getOrDefault(c,0)+1);
      }
      Map<Character,Integer> winMap = new HashMap<>();
      int i = 0;
      int j = 0;
      int ans = 0;
      while(j<n){
          char ch  = txt .charAt(j);
          winMap.put(ch, winMap.getOrDefault(ch, 0)+1);
          if(j-1+1<k){
              j++;
          }
          else if(j-i+1==k){
              if(winMap.equals(patMap)){
                  ans++;
              }
              char left = txt.charAt(i);
              winMap.put(left, winMap.get(left)-1);
              if(winMap.get(left)==0)
                  winMap.remove(left);
              i++;
              j++;
          }
      }
        return ans;


    }
    public static int countOccurences(String txt, String pat) {
        int n = txt.length();
        int k = pat.length();
        Map<Character, Integer> patMap = new HashMap<>();
        for (char ch : pat.toCharArray()) {
            patMap.put(ch, patMap.getOrDefault(ch, 0) + 1);

        }
        Map<Character, Integer> winMap = new HashMap<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < n) {
            char ch = txt.charAt(j);
            winMap.put(ch, winMap.getOrDefault(ch, 0) + 1);
            if (j - i + 1 == k) {
                if (winMap.equals(patMap)) {
                    ans++;
                }
            char leftChar = txt.charAt(i);
            int count = winMap.get(leftChar);
            count--;
            if (count == 0) {
                winMap.remove(leftChar);
            } else {
                winMap.put(leftChar, count);
            }

            i++;
        }
            j++;


        }
        return ans;
    }


    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // remove out-of-window indices
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // window formed
            if (i >= k - 1) {
                res[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return res;
    }


        private boolean canCoverAll(int[] houses, int[] heaters, int r) {
            int heaterIdx = 0;

            for (int house : houses) {
                // Move to the first heater that could potentially reach this house.
                // A heater covers a house if: (heater - r) <= house <= (heater + r)
                while (heaterIdx < heaters.length && (long)heaters[heaterIdx] + r < house) {
                    heaterIdx++;
                }

                // If we've exhausted all heaters or the current heater starts after the house range
                if (heaterIdx == heaters.length || (long)heaters[heaterIdx] - r > house) {
                    return false;
                }
            }
            return true;
        }

        public int findRadius(int[] houses, int[] heaters) {
            // Sorting is essential for the two-pointer check inside the binary search
            Arrays.sort(houses);
            Arrays.sort(heaters);

            int low = 0;
            int high = 1_000_000_000; // Based on constraints (10^9)
            int ans = high;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (canCoverAll(houses, heaters, mid)) {
                    ans = mid;          // Current radius works, try smaller
                    high = mid - 1;
                } else {
                    low = mid + 1;      // Radius too small, must increase
                }
            }

            return ans;
        }


    }

