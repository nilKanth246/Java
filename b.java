class Animal 
{
void eat()
{
  System.out.println("Eating");
}
}
class Dog extends Animal
{
void bark()
{
    System.out.println("barking");
}
}
class BabyDog extends Dog
{
    void weep() 
    {
        System.out.printf("weeping");
    }
}
class Multipleinh
{
    public static void main(String [] args)
{
    BabyDog d = new BabyDog();
    d.eat();
    d.bark();
    d.weep();
}
}





