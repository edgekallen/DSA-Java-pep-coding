import java.util.Scanner;

public class AnyBasetoAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base1 = scn.nextInt();
        int base2 = scn.nextInt();

        int result1 = getvaluetodecimal(number, base1);
        int fresult = getvaluetoanybase(result1 , base2);

        System.out.println(fresult);
    }

    public static int getvaluetodecimal(int n, int b) {
        int pw = 1;
        int result = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            result += rem * pw;
            pw *= b;
        }
        return result;
    }
        public static int getvaluetoanybase( int num , int basetoconvert){
            int rem;
            int p=1;
            int rem2=0;
            while (num>0){
                rem = num % basetoconvert;
                num = num / basetoconvert;

                rem2 += rem*p;
                p = p * 10;
            }
            return(rem2);

        }


    }

