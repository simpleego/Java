import java.util.*;
 
public class EnglishDic {
       public static void main(String[] args) {
             Map<String, String> st = new HashMap<String, String>();

             st.put("map", "����");
             st.put("java", "�ڹ�");
             st.put("school", "�б�");

             Scanner sc = new Scanner(System.in);
             do {
                 System.out.print("���� �ܾ �Է��Ͻÿ�:");
                 String key = sc.next();
                 if( key.equals("quit") ) break;
                 System.out.println("�ܾ��� �ǹ̴� " + st.get(key));
             } while(true);
       }
}