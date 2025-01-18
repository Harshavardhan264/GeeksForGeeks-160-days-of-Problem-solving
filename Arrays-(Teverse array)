import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();
            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// Solution class
class Solution {
    public void reverseArray(int arr[]) {
        // Two-pointer approach to reverse the array
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap the elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }
    }
}
