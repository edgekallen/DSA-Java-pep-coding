import java.util.Scanner;

public class OptimalSecondLargestElementInArray {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
            int result = getslargestelement(arr, size);
            System.out.println(result);

    }
    public static int getslargestelement( int arr[] ,int size)
    {
        int largest = arr[0];
        int slargest = -1;

        for (int i = 1; i < size; i++)
          {
            if (arr[i] > largest)
              {
                slargest = largest;
                largest = arr[i];
              }
            else if (arr[i] < largest && arr[i] > slargest)
              {
                slargest = arr[i];
              }
          }

       return(slargest);
    }
}
