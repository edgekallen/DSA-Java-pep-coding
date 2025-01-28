import java.util.Scanner;

public class Spanofarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int max=0 , min=0 ;

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scn.nextInt();
        }
        int initialarr = arr[0];
        int initialarr2= arr[0];
        for (int i = 0; i <num ; i++) {
            if(initialarr < arr[i])
           max =  initialarr = arr[i];

            if (arr[i]<initialarr2) {
                min = initialarr2 = arr[i];
            }

        }

        System.out.println(max-min);
    }
}
