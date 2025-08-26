import java.util.*;

public class MaxSubarray {

    public static void main(String args[]) {

        int arr[] = { -1, -2, -3, -5, -6, -8, -7, -4 };
        int cursum = arr[0], maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            cursum = Math.max(arr[i], cursum + arr[i]);
            maxSum = Math.max(cursum, maxSum);

        }
        System.out.println("max sum is " + maxSum);

    }

}
