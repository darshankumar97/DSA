package Sorting;
import java.util.Arrays;

public class selectionSort {

  
      public static void main(String args[]) {
        int[] nums = { 13, 46, 24, 52, 20, 9 };
        int n = nums.length;
    
        for (int i = 0; i < n - 1; i++) {
          int min = i;
          for (int j = i + 1; j < n; j++) {
            if (nums[j] < nums[min]) {   // ✅ fixed: compare with nums[min], not nums[i]
              min = j;                   // store the index of minimum
            }
          }
          // swap once per outer loop
          int temp = nums[i];
          nums[i] = nums[min];
          nums[min] = temp;
        }
    
        System.out.print(Arrays.toString(nums));
      
    }

    

    
}
