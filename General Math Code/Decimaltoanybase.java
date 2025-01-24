import java.util.Scanner;

public class Decimaltoanybase {
    public static void main(String[] args) {



        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int basetoconvert = scn.nextInt();

        int rem;
        int p=1;
        int rem2=0;
        while (num>0){
             rem = num % basetoconvert;
            //System.out.print(rem);
            num = num / basetoconvert;

             rem2 += rem*p;
             p = p * 10;
        }
        System.out.println(rem2);

    }
}
