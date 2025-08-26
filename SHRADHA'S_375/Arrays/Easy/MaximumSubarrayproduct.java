public class MaximumSubarrayproduct {

    public static int maxProduct(int[] ars){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<ars.length-1;i++){
            int product = 1;
            for(int j = i; j<=ars.length-1;j++){
                product = product*ars[j];
                max = Math.max(max,product);

            }
        }
        return max;
    }


    public static void main(String[] args){
        int[] ars = {1,2,3,7,0,5,-8};
        System.out.println(maxProduct(ars));
    }
    
}
