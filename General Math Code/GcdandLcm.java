import java.util.Scanner;

public class GcdandLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

    int onum1 = num1;
    int onum2 = num2;
    while ( num1 % num2 != 0){
          int n = num1 % num2;
            num2 = num1;
            num1 = n;
    }
    int gcd = num1;



     int lcm = ( onum1 * onum2) / gcd;
        System.out.println(lcm);
        System.out.println(gcd);

    }
}
