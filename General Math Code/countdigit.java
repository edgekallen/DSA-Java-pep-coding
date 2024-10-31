import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {

                Scanner scn =  new Scanner( System.in );
                int digit = scn.nextInt();

                int count = 0;

                while (digit != 0){

                    digit = digit/10;
                    count++;
                }

                System.out.println(count);
            }
        }
