package Assignment1;
import java.util.Scanner;
class input       
{
   private char a;
   private int age;
    
    void in()
    {
        System.out.println("Enter your gender Female= F or Male= M");
         Scanner obj=new Scanner(System.in);
         a=obj.next().charAt(0);
         System.out.println("Enter your age ");
         age=obj.nextInt();
         if (a == 'F' && age > 21 ) 
         {
            System.out.println("Your age is valid according to indian norms");
         }
        else if ( a == 'M' && age > 18)
         {
             System.out.println("Your age is valid according to indian norms");
         }
         else 
         {
             System.out.println("Your age is not valid according to indian norms");
         }
    }
}
class Ans15
{
    public static void main(String[] args)
    {
          input obj1=new input();
          obj1.in();
    }
}
     
      
     
   