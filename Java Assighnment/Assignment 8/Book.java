public class Book
{
    private String author,title ; 
    private int price ;
    
    public Book()
    {
        
    }

    public Book(String author,String title)
    {
        this();
        this.author = author ;
        this.title = title ;
    }

    public Book(String author , String title , int price)
    {
        this(author,title);
        this.price = price ;
    }
    public void getDetails()
    {
        System.out.println("Author: "+ author + ", Title: " + title + ", Price: " + price);
    }

    public static void main (String [] args)
    {
        Book b1 = new Book();
        b1.getDetails();
        
        Book b2 = new Book("J.K. Rowling","Mahalud");
        b2.getDetails();
        
        Book b3 = new Book("George Orwell", "1984", 250);
        b3.getDetails();
    }
}
