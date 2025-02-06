import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {4,1,5,2,3};
        int num = arr.length;
        selectionsort(arr, num);
    }

    public static void selectionsort(int arr[], int num) {
        for (int i = 0; i < num-1; i++) {
              int min = i;
            for (int j =i+1 ; j < num; j++) {
                if (arr[j] <= arr[min]) {
                  min = j;
                }
            }
          int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i <num ; i++) {
            System.out.println(arr[i]);
        }
    }
}

