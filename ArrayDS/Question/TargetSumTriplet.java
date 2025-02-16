import java.util.Scanner;

public class TargetSumTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size of an array");
        int size = scn.nextInt();

        System.out.println("Enter Target");
        int Target = scn.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        int result = getsum(arr, size, Target);
        System.out.println("The Pair is:" + result);
    }

    public static int getsum(int arr[], int size, int Target)
    {
        int pair = 0;
        for (int i = 0; i < size; i++) {
            for (int k = i + 1; k < size; k++) {
                for (int j = k + 1; j < size; j++) {
                    if (arr[i] + arr[k] + arr[j] == Target) {
                        pair++;
                    }
                }
            }

        }
        return pair;
    }
}
