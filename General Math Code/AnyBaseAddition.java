import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int finalresult = getsum(b, num1, num2);
        System.out.println(finalresult);
    }
    public static int getsum(int b,int num1, int num2){
        int rem=0;
        int c=0;
        int p=1;
      while(num1>0 || num2>0 || c>0) {

          int reducednum1 = num1 % 10;
          num1 = num1 / 10;
          int reducednum2 = num2 % 10;
          num2 = num2 / 10;

          int d = reducednum1 + reducednum2 + c;
          c = d/b;
          d = d % b;


          rem += d*p;
          p = p * 10;
      }
      return rem;

    }
}
