import java.util.Scanner;

public class digitofnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int n = num;
        int count = 0 ;
      while (n != 0 ){
          n = n / 10;
          count++;
      }
      int pow = ( int )Math.pow( 10 , count-1);
      while ( pow != 0 ){
          int result = num / pow;
          System.out.println(result);
          num = num % pow ;
          pow = pow / 10;

      }
    }
}
