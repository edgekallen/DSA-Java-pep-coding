import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int num = scn.nextInt();
        int [] arr = new int[num];
        for (int i = 0; i <num ; i++) {
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter no you want to search");
        int sE = scn.nextInt();
        System.out.println(binarySearch(arr,num,sE));

    }
    public static int binarySearch(int arr[],int num,int sE){
        int st=0;
        int end=num-1;
        while (st<=end){
            int mid = (st+end)/2;
            if(arr[mid]>sE){
                end=mid-1;
            }
            if(arr[mid]<sE){
                st = mid+1;
            }
            else
                return mid;
        }
        return -1;
    }

}
