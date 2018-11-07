import java.util.Scanner;
class BasicCalculator
{ 
    static int add(int x,int y)
    {
        int A1=x+y;
        return A1;
    }

    static int subtract(int x,int y)
    {
        int A2=x-y;
        return A2;
    }

    static int multiply(int x,int y)
    {
        int A3=x*y;
        return A3;
    }

    static int divide(int x,int y)
    {
        int A4=x/y;
        return A4;
    }

    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Put first numbber  => ");    
        int x = sc.nextInt();
        System.out.print("Put second numbber  => ");    
        int y = sc.nextInt(); 
    
        int a = add(x,y);
        int b = subtract(x,y);
        int c = multiply(x,y);
        int d = divide(x,y);

        System.out.println(" ");
        System.out.println("Answer of add is => "+a);
        System.out.println("Answer of subtract is => "+b);
        System.out.println("Answer of multiply is => "+c);
        System.out.println("Answer of divide is => "+d);
    }
}