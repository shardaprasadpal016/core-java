import java.net.SocketTimeoutException;
import java.util.Scanner;
public class calculator
 {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first num1:");
        int num1=s.nextInt();
        System.out.println("enter the second num2");
        int num2=s.nextInt();
         System.out.println("select symgbol(+,-,*,/)");
         String symbol=s.next();
         int result;
         switch(symbol)
         {
            case "+":
            result=num1+num2;
            System.out.println(result);
            break;
            case "-":
            result=num1-num2;
            System.out.println(result);
            break;
            case "*":
            result=num1*num2;
            System.out.println(result);
            break;

            case "/":
            result=num1/num2;
            System.out.println(result);
            break;
            default:
            System.out.println("Invalid Sybol");
         }
    }
}
