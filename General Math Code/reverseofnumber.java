import java.util.Scanner;

public class reverseofnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
     int num = scn.nextInt();
     while (num != 0 ){

         int result = num % 10;
         System.out.println(result);
         num = num / 10;
     }
    }
}
