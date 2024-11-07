import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Rotatenumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int  k = scn.nextInt();
int temp = num;
        int count = 0;
    while (temp != 0 ) {
        temp = temp / 10;
        count++;
    }
        k = k % count;
        if ( k < 0 ){
            k = k + count;
        }

    int div = 1;
    int mul = 1;
     for ( int x = 1 ; x <= count ; x++ ){
         if ( x <= k){
              div = div * 10;
         }
         else
               mul = mul * 10;
     }
        int rem = num / div ;
        int q = num % div ;

        int rot = q * mul + rem ;

        System.out.println(rot);
    }


}
