import java.util.Scanner;

public class UniqueElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size of an array");
        int size = scn.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        int result = uniqueElement(arr, size);
        System.out.println("The Pair is:" + result);
    }
    public static int  uniqueElement(int arr[], int size) {
        int pair = 0;
        for (int i = 0; i < size; i++) {
            for (int k = i + 1; k < size; k++) {
                if (arr[i] == arr[k]) {
                    arr[i]=-1;
                    arr[k]=-1;
                }
            }
        }
        int ans=-1;
        for (int i = 0; i <size ; i++) {
            if(arr[i]>0)
            {
                 ans=arr[i];
            }
        }
        return ans;
      }

    }

