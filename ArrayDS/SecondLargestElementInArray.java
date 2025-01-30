import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
             arr[i] = scn.nextInt();
        }
        int lar = arr[0];
        for (int i = 0; i < size ; i++) {
          if(arr[i]>lar){
              lar = arr[i];
          }
        }
        int slargest = -1;
        for (int i = 0; i <size ; i++) {
            if( arr[i]>slargest && arr[i]!=lar){
                slargest = arr[i];
            }
        }
        System.out.println(slargest);

    }

}
