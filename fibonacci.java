public class fibonacci {
    public static void main(String[] args) {
        int a=5,b=6,c;
        for(int i=1;i<=10;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
