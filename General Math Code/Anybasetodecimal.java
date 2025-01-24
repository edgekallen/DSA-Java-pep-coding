import java.util.Scanner;

public class Anybasetodecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();
         int pw = 1;
         int result = 0;
        while (num>0){
             int rem = num % 10;
              num = num / 10;
              result += rem * pw;
             pw *= base;
        }

        System.out.print(result);

    }
}
