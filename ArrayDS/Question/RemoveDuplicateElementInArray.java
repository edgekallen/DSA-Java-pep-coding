import java.util.Scanner;

public class RemoveDuplicateElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i] = scn.nextInt();
        }
          int j =0;
        for (int i = 1; i <size ; i++) {
            if(arr[j]!=arr[i]) {
                arr[j+1] = arr[i];
                    j++;
                }
            }

            System.out.println(j+1);
        }
    }

