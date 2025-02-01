import java.util.ArrayList;
import java.util.Scanner;

public class TransferZeroToEnd {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        int result[] = End_zero(arr,size);
        for (int i = 0; i <size ; i++) {
            System.out.println(result[i]);
        }
    }
    public static int [] End_zero( int [] arr , int size ) {
        ArrayList<Integer> Temp = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                Temp.add(arr[i]);
            }
        }
        for (int i = 0; i < Temp.size(); i++) {
            arr[i] = Temp.get(i);
        }
        int length = Temp.size();
        for (int i = Temp.size(); i < size; i++) {
            arr[i] = 0;
        }
        return arr;
    }
}
