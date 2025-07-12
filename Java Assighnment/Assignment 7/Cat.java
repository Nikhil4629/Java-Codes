import java.util.Scanner ;
class Animal
{
    String name ;
    String colour ;

    public void makeSound()
    {
        System.out.println("Animal Makes sound.");
    }
}
public class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Cat makes the sound Meow.");
    }
    public void Details()
    {
        System.out.println("Enter the name of the Cat: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter the colour of the Cat: ");
        colour = sc.nextLine();
        System.out.println("The name of the Cat is: " + name);
        System.out.println("The colour of the Cat is: " + colour);
        sc.close();
    }
    public static void main(String[] args)
    {
        Animal a = new Animal();
        a.makeSound(); 
        Cat c = new Cat();
        c.Details();
        c.makeSound();
    }
}