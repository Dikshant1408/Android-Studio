class Animal
{
    public void eat()
    {
        System.out.println("I am eating");
    }
    public static void main(String[] args)
    {
        Animal buzo = new Animal();
        Birds sp = new Birds();
        Car lambo = new Car();
        buzo.eat();
        buzo.run();
        sp.fly();
        lambo.intObj("black",10);
        lambo.display();
    }
    public void run()
    {
        System.out.println("I am running");
    }
}
class Birds
{
    public void fly()
    {
        System.out.println("I am flying");
    }
}
class Car
{
    String color;
    int age;
    void intObj(String a,int b)
    {
        color = a;
        age = b;
    }
    void display()
    {
        System.out.println(color+" "+age);
    }
}
