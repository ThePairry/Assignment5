import java.util.Scanner;
public class SwapInteger
{
     public static void main(String[] args)
     {  
         Scanner in = new Scanner(System.in);
         System.out.print("Put a = ");
         int a = in.nextInt();
         System.out.print("Put b = ");
         int b = in.nextInt();
         System.out.println(a+"  "+b);
         
         int tmp = a;
         a = b;
         b = tmp;
         System.out.println("After Swapped");
         System.out.println(a+"  "+b);
        }
}