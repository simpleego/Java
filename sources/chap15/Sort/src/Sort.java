import java.util.*;
 
public class Sort {
       public static void main(String[] args) {
             String[] sample = { "i", "walk", "the", "line" };
             List<String> list = Arrays.asList(sample);	  // �迭�� ����Ʈ�� ����
             Collections.sort(list);
             System.out.println(list);

       }

} 