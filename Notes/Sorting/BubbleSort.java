package Sorting;

import java.util.Arrays;

public class BubbleSort {
      public static void main(String args[]) {
    int[] nums = { 3, 4, 1, 5, 22, 19,0 };
    int n = nums.length;

    for (int i =n-1; i >=0; i--) {
      int swap = 0;
      for (int j = 0; j < i; j++) {
        if (nums[j] > nums[j+1]) {
          // swap
          int temp = nums[j];
          nums[j] = nums[j+1];                  
          nums[j+1] = temp;
          swap =1;

        }
      }
      if(swap == 0){      // BEST CASE IS O(N);
        break;
      }
     

    }
    System.out.print(Arrays.toString(nums));
}
}
