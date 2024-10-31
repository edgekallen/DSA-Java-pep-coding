import java.util.Scanner;

public class Primechecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        for (int i = 0; i <= x; i++) {
            int n = scn.nextInt();
            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");


        }
    }
}