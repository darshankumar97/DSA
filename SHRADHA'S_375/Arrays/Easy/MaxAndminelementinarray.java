// package DSA 375.Arrays.Easy;

public class MaxAndminelementinarray {
    

    public static int darshan (int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max =arr[i];
            }
          

        }
        return max;
       

    }
    public static void main(String[] args){
        int[] arr = {1,4,2,9,3,10};
        System.out.println("maximum element is "+darshan(arr));

    }
}
