import java.util.Scanner;

import java.util.Scanner;
public class adding 
{
 public static void main(String[] args)
  {
   int sum=0;
   System.out.println("enter the number:");
   Scanner sc=new Scanner(System.in); 
   int num=sc.nextInt();
   for(int i=1;i<=num;i++)
   {
    sum=sum+i;

   }
   System.out.println(sum);
 }   
}
