public class Dog
{
    private String name,colour ;

    public Dog(String name, String colour)
    {
        this.name = name ;
        this.colour = colour ;
    }

    public void details()
    {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Colour: " + colour);
    }

    public static void main (String [] args)
    {
        Dog d = new Dog("Buddy", "Brown");
        d.details();
        
        // Example of changing the dog's name and colour
        d.name = "Max"; // Direct access for simplicity, not recommended in real code
        d.colour = "Black";
        d.details();
    }
    
}
