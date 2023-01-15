class A
{
    void show()
    {
    System.out.println("a class method");
}
}
class B extends A
{
    void run()
    {
        System.out.println("b class method");
    }


    public static void main(String[] args) {
        A ob1=new A();
        ob1.show();
        B ob2= new B();
        ob2.show();
        ob2.run();
    }
}