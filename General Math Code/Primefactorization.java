import java.util.Scanner;

public class Primefactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

      for ( int i = 2 ; i<= num ; i++){
          while ( num % i == 0 ){
              num = num / i ;

//              System.out.println("1");

              System.out.println(i);
          }

          }

      }

    }

