import java.util.ArrayList;
import java.util.*;

public class InroToArraylistInJava {
    public static void main(String[] args) {
      ArrayList<Integer> List = new ArrayList<>();
      // Adding element In an List ;
      List.add(0);
      List.add(9);
      List.add(4);
      List.add(2);
        System.out.println(List);

     // Adding element In an Index ;
        List.add(0 ,12);
        List.add(2,5);
        System.out.println(List);

      // Set Element ;
      List.set(0 ,1);
        System.out.println(List);

      // Remove Element ;
      List.remove(3);
        System.out.println(List);

      // Size of list ;
      int size = List.size();
        System.out.println(size);

      // Loops ;
      for (int i = 0; i <List.size() ; i++) {
        System.out.print(List.get(i));
      }
      //  Direct Sorting Using Collection Framework ;
      Collections.sort(List);
      System.out.println(List);
    }
}
