import java.util.*;
public class Maxminvalue
{
  public static void main(String[] args)
  {
       
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[5];
       System.out.println("Enter elements in array:");
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<=4;i++)
       {
         arr[i]=sc.nextInt();
         if(arr[i]<min)
           {
           min=arr[i];
           }
         if(arr[i]>max)
         {
           max=arr[i];
         }
       }
       System.out.println("Maximum element : "+max);
       System.out.println("Minimum element : "+min);
       
       
  }
}