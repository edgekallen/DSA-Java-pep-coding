import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scn.nextInt();
        }
          int result = sortedarray(arr, num);
          System.out.println(result);
 }
    public static int sortedarray( int arr[], int num)
       {
        for (int i = 1; i <num ; i++)
          {
            if (arr[i]>=arr[i-1])
              {

              }
               else
               {
                   return -1;
               }
          }
          return 1;
        }
}
