import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int num = scn.nextInt();
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=num ; j++) {
                if(i==j){
                    System.out.print("*\t");
            }
                else {
                    System.out.print("\t");
                }
        }
            System.out.println();
        }
    }
}
