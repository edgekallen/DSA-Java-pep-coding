import java.util.Scanner;

public class AnybaseSubstraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int finalresult = getsubstraction( base,num1,num2 );
        System.out.println(finalresult);
    }

    public static int getsubstraction(int b ,int n1 ,int n2 ) {
        int rv = 0;
        int p = 1;
        int c = 0;
        while (n2>0){
        int result;
            int a = n1 % 10;
            n1 = n1 / 10;
            int d = n2 % 10;
            n2 = n2 / 10;
            d=d+c;
            if (d >= a) {
                c = 0;
                result = d - a;
            } else {
                c = -1;
                result = d + 8 - a;
            }
            rv= rv+result*p;
            p=p*10;
        }
        return rv;
    }
}
