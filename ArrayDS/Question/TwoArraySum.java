import java.util.Scanner;

public class TwoArraySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int loop;

        int num1arr = scn.nextInt();
        int[] arr1 = new int[num1arr];
        for (int i = 0; i <num1arr ; i++) {
            arr1[i]=scn.nextInt();
        }
        int num2arr = scn.nextInt();
        int[] arr2 = new int[num2arr];
        for (int i = 0; i < num1arr; i++) {
            arr2[i] = scn.nextInt();
        }
        if (arr1.length> arr2.length){
             loop = arr1.length;
        }
        else {
             loop = arr2.length;
        }
        for(int i=0; i<loop; i++ ) {
            int sum = arr1[i]+arr2[i];
            System.out.println(sum);

        }
    }
}