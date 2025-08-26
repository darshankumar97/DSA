import java.util.Arrays;

// O(nlogn)
public class ContainDuplicate {
    public static boolean duplicate (int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] == nums[i+1]) {
                return true;

            }
        }

        return false;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 2, 3, 5, 6 };
        System.out.println(duplicate(nums));
    }
}

// hash method which is O(n)

// public static boolean Containsduplicate(int[] arr) {

//     Set<Integer> intSet = new HashSet<>();

//     for (int num : arr) {
//       if (!intSet.add(num)) {

//         return true;
//       }

//     }
//     return false;

//   }