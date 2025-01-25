import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num  = scn.nextInt();
        int space=num/2;
        int star=1;
        for(int i=1; i<=num; i++) {
                for (int j = 1; j <= space; j++) {
                    System.out.print("\t");
                }
                for (int x = 1; x <= star; x++) {
                    System.out.print("*\t");
                }
                if (i<=num/2) {
                    space--;
                    star += 2;
                } else {
                    space++;
                    star -= 2;
                }
              System.out.println();
            }

        }
    }

