import java.util.Scanner;

public class fibonaccinumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = 0 ;
        int y = 1 ;
        int c ;

        for ( int i = 0 ; i < n ; i++){
            System.out.println(x);
            c = x + y ;

            x = y;
            y = c ;
        }
    }
}
