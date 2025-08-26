import java.util.Arrays;
public class ChoclateDistrubution{

    public static int distrubute(int[] num,int m){
        int n =num.length;
        if (m == 0 || n == 0){

        return 0;
        }
        if (m>n) {
            return -1;
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        
        int mindiff =Integer.MAX_VALUE;
        for (int i =0;i+m-1<n;i++){                    // sliding window 
           int diff = num[i+m-1]-num[i];
           mindiff =Math.min(mindiff,diff);
        }
        return mindiff;
    }

    public static void main(String[] args){
     int[] num = {7, 3, 2, 4, 9, 12, 56};
     int m = 3;
     
     System.out.println(distrubute(num,m));

    }
}