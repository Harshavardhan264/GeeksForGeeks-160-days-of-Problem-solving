import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            new Solution().pushZerosToEnd(arr);
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int index = 0; // Pointer for the next non-zero element
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element to the current index
                arr[index] = arr[i];
                index++;
            }
        }
        
        // Fill the remaining positions with zeros
        while (index < n) {
            arr[index] = 0;
            index++;
        }
    }
}
