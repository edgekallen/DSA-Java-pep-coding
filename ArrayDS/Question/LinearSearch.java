import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int selement = scn.nextInt();
        int num = scn.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scn.nextInt();
        }
        int result = searchElement(arr , num , selement);
        System.out.println(result);
    }
    public static int searchElement(int arr[], int num , int selement){
        for(int i = 0; i <num ; i++) {
            if(arr[i]==selement){
                return i;
            }
        }
        return -1;
    }
}
