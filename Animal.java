class Animal
{
    public void eat()
    {
        System.out.println("I am eating");
    }
    public static void main(String[] args) 
    {
        System.out.println("1");

        Animal buzo=new  Animal();
        buzo.eat();
        buzo.run();
        Animal aa=new Animal();
        aa.eat();
        aa.run();
        Bird hen=new Bird();
        hen.fly();

    }
    public void run()
    {
        System.out.println("I am runing");
    }
}
class Bird
{
    public void fly()
    {
        System.out.println("I am fly");
    }
}