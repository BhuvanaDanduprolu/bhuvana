import java.util.Scanner;
class EvenOdd
{
  public static void main(String args[])
   {
    int i=1;
    if(i%2==0)
    {
       System.out.println("even");
       i=-(~i);
    }
    else
   {
     System.out.println("odd");
    }
 }
}