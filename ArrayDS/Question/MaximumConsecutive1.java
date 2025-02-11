import java.util.Scanner;

public class MaximumConsecutive1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scn.nextInt();
        }
        int count=0;
        int max1=0;
        for (int j = 0; j <num ; j++) {
            if(arr[j]==1) {
                count++;
               max1=max(max1,count);
            }
            else
                count=0;
        }
        System.out.println("Maximum consecutive ones is:"+max1);
    }
    public static int max(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
}
