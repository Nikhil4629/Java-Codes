public class Cat
{
    private String name;
    private int age ;

    public Cat()
    {
        this.name = "Unknown" ;
        this. age = 0 ;
    }

    public String getName()
    {
       return name ;
    }

    public void setName(String name)
    {
        
        this.name = name ;
    }

    public int getAge()
    {
       return age ;
    }

    public void setAge(int age)
    {
        this.age = age ;
    }

    public String toString()
    {
        return "Cat [name=" + name + ", age=" + age + "]";
    }

    public static void main (String [] args)
    {
        Cat c = new Cat() ;
        c.getName();
        c.getAge();
        System.out.println(c.toString());
        c.setName("Whiskers");
        c.setAge(3);
        System.out.println(c.toString());
    }
}