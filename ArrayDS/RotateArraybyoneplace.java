import java.util.Scanner;

public class RotateArraybyoneplace {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i] = scn.nextInt();
        }
        int temp;
         temp = arr[0];
        for (int i = 1; i <size ; i++) {
            arr[i-1] = arr[i];
        }
        arr[size-1] = temp;
        for (int i = 0; i <size ; i++) {
            System.out.println(arr[i]);
        }
    }
}
