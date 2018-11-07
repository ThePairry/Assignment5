import java.util.Scanner;
class SequenceLoops
{
    static void ForLoop()
    {
        System.out.println("By For loop");
        for(int i=1;i<11;i++)
            {
            System.out.println(i); 
            }   

    }

    static void WhileLoop()
    {
        System.out.println("By While Loop");
        int i=1;
        while(i<11)
            {   
            System.out.println(i);
            i++;
            }
    }

    static int RecursiveLoop()
    {   
        int n=1;
        if (n > 1) 
        {
            return 1;
        }
        return recursive(n-1);
    }
    public static void main (String[]args)
    {
        ForLoop();
        System.out.println();
        WhileLoop();
        System.out.println();
        int R=RecursiveLoop();
        System.out.println(R);
    }
}