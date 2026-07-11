//package DSAPractice.Arrays;
//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Solution {
//
//
//    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//    public class Product {
//        String name;
//        double price;
//
//        public Product(String name, double price) {
//            this.name = name;
//            this.price = price;
//        }
//
//    }
//
//    public void main(String args[]) throws Exception {
//
//        List<Product> products = new ArrayList<>();
//
//        products.add(new Product("Watch", 100));
//        products.add(new Product("Laptop", 100));
//        products.add(new Product("Mobile", 100));
//        products.add(new Product("Watch", 100));
//        products.add(new Product("Iphone", 100));
//        products.add(new Product("TV", 100));
//
//        int k = 2;
//
//        List<Product> result = findMostExpensive(products, k);
//        System.out.println("Top" + k + "most Expensive");
//
//    }
//
//    public static List<Product> findMostExpensive(List<Product> products, int k) {
//
//        if (products == null || products.size() == 0 || k <= 0) {
//
//            return new ArrayList<>();
//        }
//
//        PriorityQueue<Product> minHeap = new PriorityQueue<>((p1, p2) -> p1.price - p2.price);
//
//        for (Product product : products) {
//            minHeap.offer(product);
//
//
//            if (minHeap.size() > k) {
//                Product removed = minHeap.poll();
//
//            }
//            List<Product> ans = new ArrayList<>();
//
//            while (minHeap.isEmpty()) {
//                ans.add(minHeap.poll());
//            }
//
//            Collections.sort(ans);
//
//            return ans;
//
//
//        }
//    }
//}
//
//
//
//
//
//}
//
//
//
//
