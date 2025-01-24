import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count=0;
               int num = scn.nextInt();
               int fnum = scn.nextInt();
           while( num!=0){
                int n  = num%10;
                num = num/10;

                if ( n == fnum){
                    count++;
                }
           }
        System.out.println(count);
    }
}







