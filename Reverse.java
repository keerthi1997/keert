import java.util.*;
 
class Reverse
{
   public static void main(String args[])
   {
      int n, m = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      while( n != 0 )
      {
          m = m * 10;
          m = m + n%10;
          n = n/10;
      }
 
      System.out.println("Reverse of entered number is "+m);
   }
}
