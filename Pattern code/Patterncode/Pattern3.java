import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n-1;
        int star = 1;
        for( int i = 0 ; i <= n ; i++){
            for ( int j = 0 ; j<=space; j++){
                System.out.print("\t");
            }

            for( int x = 1; x <= star ; x++){
                System.out.print("*\t");
            }
            space--;
            star++;

            System.out.println();
        }

    }

}
