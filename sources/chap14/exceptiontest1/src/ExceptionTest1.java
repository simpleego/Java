class MyException extends Exception {
   public MyException()
   {
      super( "����� ���� ����" );
   }
}
public class ExceptionTest1 {
   public static void main( String args[] )
   {
      try {
         method1();
      }
      catch ( MyException e )
      {
         System.err.println( e.getMessage() + "\nȣ�� ���� ����:" );
         e.printStackTrace();
      }
   }
 
   public static void method1() throws MyException
   {
      throw new MyException();
   }
}