import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

      int [] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=scn.nextInt();
        }

       int fnum = scn.nextInt();

        for (int i = 0; i < num; i++) {
            if( arr[i]==fnum){
                System.out.println(i);
            }
        }
    }
}
