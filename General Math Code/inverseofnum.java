import java.util.Scanner;

public class inverseofnum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int inverted = 0 ;
        int originalpos = 1;
        while ( num != 0){

            int origdigit = num % 10 ;
             int pow = origdigit;
             int invertedpos = originalpos;

             inverted  = inverted + invertedpos * ( int )Math.pow( 10 , origdigit -1);
              num = num / 10 ;
              originalpos++;

        }
        System.out.println(inverted);

    }
}
