import java.util.Scanner;

public class Arrayreverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int [] arr = new int[num];
        for (int i = 0; i <num ; i++) {
            arr[i]= scn.nextInt();
        }
        int r=1;
        for (int i = 0; i <num/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[num-r];
            arr[num-r] = temp;
             r++;
        }
        for (int i = 0; i <num ; i++) {
            System.out.println(arr[i]);
        }
    }
}
