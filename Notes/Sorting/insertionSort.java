package Sorting;
import java.util.Arrays;

public class insertionSort {

public static void main(String[] args){
    int[] nums = {6,2,9,1,3,0,12,4};
    int n = nums.length;
    for(int i =1;i<n;i++){
       int curr = nums[i];
       int prev =i-1;

       while(prev>=0 && nums[prev]>curr){
        nums[prev+1] = nums[prev];
        prev--;
       }

       nums[prev+1] = curr;
    }
    System.out.println(Arrays.toString(nums));
}


   
    
}
