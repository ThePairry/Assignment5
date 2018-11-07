import java.util.Scanner;
class CompareBinary
{
  public static void main (String[]args)
  {
    int [] data = new int[101];
    for(int i=1;i<=101;i++)
    {
      Random rand = new Random();
      int n = rand.NextInt(1)+0;
      data[i]=n;
    }
      int xx = countZero(data);
      int yy = countOne(data);
      boolean t = compare(xx,yy);
  }
  static int CountZero(int[] integerArray)
  {
      int x;
      for(int j=1;j<=101;j++)
      {
        if(data[j]==0)
        {x = x+1;} 
     
        else;
      }
      
      return x;
  }
  static int CountOne(int[] integerArray)
  {
    int y;
    for(int k=1;k<=101;k++)
    {
      if(data[k]==0)
      {y = y+1;} 
    
      else; 
    }
    
    return y;
  }
  static boolean compare(int[] integerArray)
  {
      boolean t = true;
      if(xx>yy)
      {t = true;}
      else;
      {t = false;}
      return t;
  }
}