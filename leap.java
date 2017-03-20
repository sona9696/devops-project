import java.util.Scanner;
 
class Leap
{
   public static void main(String args[])
   {
      int x;
      System.out.println("Enter an year to check if it is leap year or not ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      if ( x % 4 == 0 )
         System.out.println("Leap year");
      else
         System.out.println("Not a Leap year");
   }
}