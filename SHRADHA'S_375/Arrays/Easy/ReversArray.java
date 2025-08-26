import java.util.Collections;
import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args ){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int start =0;
        int end =arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;                       //  Collections.reverse(Arrays.asList(arr));
        }

        System.out.println(Arrays.toString(arr));
    }




    
}
