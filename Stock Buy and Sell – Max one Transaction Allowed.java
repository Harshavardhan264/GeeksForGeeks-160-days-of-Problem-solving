//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String arr[] = br.readLine().split(" ");
            int prices[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                prices[i] = Integer.parseInt(arr[i]);
            }
            Solution obj = new Solution();
            int res = obj.maximumProfit(prices);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maximumProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE; // Track the minimum price so far
        int maxProfit = 0; // Track the maximum profit

        for (int price : prices) {
            // Update the minimum price if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit and update maxProfit if it's larger
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}
