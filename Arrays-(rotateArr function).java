//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim()); // Number of test cases
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");
            ArrayList<Integer> array = new ArrayList<>();
            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }
            int d = Integer.parseInt(in.readLine().trim()); // Rotation count
            int n = array.size();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = array.get(i);
            new Solution().rotateArr(arr, d); // Rotating the array
            StringBuilder sb = new StringBuilder();
            // Printing the elements of the array
            for (int value : arr) sb.append(value).append(" ");
            out.println(sb.toString().trim());
            out.println("~");
        }
        out.flush();
        out.close();
    }
}
// } Driver Code Ends

// User function Template for Java
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; // In case d is greater than n
        if (d == 0) return; // No rotation needed if d is 0 or a multiple of n

        // Reverse the first d elements
        reverse(arr, 0, d - 1);
        // Reverse the remaining n - d elements
        reverse(arr, d, n - 1);
        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse a portion of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
