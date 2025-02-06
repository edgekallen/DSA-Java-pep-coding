import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int num = scn.nextInt();
        int [] arr = new int[num];
        for (int i = 0; i <num ; i++) {
            arr[i]=scn.nextInt();
        }
        Bubblesort(arr,num);
    }
    public static void  Bubblesort(int arr[], int num) {
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }
}

