import java.util.*;
 
public class Search {
       public static void main(String[] args) {
             int key = 50;
             List<Integer> list = new ArrayList<Integer>();
             for (int i = 0; i < 100; i++)
                    list.add(i);
             int index = Collections.binarySearch(list,key);
             System.out.println("Ž���� ��ȯ��  =" + index);
       }
}