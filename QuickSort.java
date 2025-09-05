

public class QuickSort {


    public static void quick(int[] nums, int i, int high){
        if(i<high){
            int idx = partition(nums,i,high);
            
            quick(nums,i,idx-1);
            quick(nums,idx+1,high);
        }
           
    }

    public static int partition(int[] nums,int low,int high){
        int pivot = nums[high];
        int i = low-1;

        for(int j =low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        i++;
        int temp = nums[i];
        nums[i] = nums[high];
        nums[high] = temp;
       
        return i;


    }
    public static void main(String[] args){
        int[] nums = {4, 33, 1, 5};
        int i =0;
        int high = nums.length-1;
        quick(nums,i,high);

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
    
}


