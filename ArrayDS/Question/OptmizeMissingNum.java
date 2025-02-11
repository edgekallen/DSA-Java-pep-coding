import java.util.Scanner;

public class OptmizeMissingNum
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        int [] arr = new int[num];

        for (int i = 0; i <num ; i++)
        {
            arr[i]=scn.nextInt();
        }
      int sumofnum=num*(num+1)/2;
      int arrsumofnum=0;
        for (int i = 0; i <num ; i++)
        {
            arrsumofnum=arrsumofnum+arr[i];
        }
        int result=sumofnum-arrsumofnum;
        System.out.println("The missing number in an array is:"+ result);

        }
    }
