public class Student
{
    private int studentId;
    private String studentName , grade ;
    
    public Student()
    {
       
    }

    public Student (int studentId , String studentName,String grade)
    {
        this();
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
   

   public void showDetails()
   {
        System.out.println("Student ID: " + studentId + ", Name: " + studentName + ", Grade: " + grade); 
   }

   public static void main (String [] args)
   {
        Student student1 = new Student();
        student1.showDetails();

        Student student3 = new Student(102, "Bob", "A");
        student3.showDetails();
   }
}
