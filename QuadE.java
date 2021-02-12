
import java.util.Scanner;
public class QuadE{
      public static void main (String[]args){
    Scanner scanner = new Scanner (System.in);
    System.out.println("enter value of a: ");
    double a = scanner.nextDouble();
    System.out.println("enter value of d: ");
    double b = scanner.nextDouble();
    System.out.println("enter value of c: ");
    double c = scanner.nextDouble();
    double discriminant;
    double root1;
    double root2;
    discriminant = Math.pow(b,2)-4*a*c;
    if (discriminant>=0){
       root1= (-b + Math.sqrt(discriminant))/(2*a);
       root2=(-b + Math.sqrt(discriminant))/(2*a);
       if (root1==root2){
         System.out.println("the roots are equal");
         System.out.println("the value is:" +root1);

       }
       else {
         System.out.println("root1 is :"+ root1);
         System.out.println("root2 is :"+ root2);
       }
      
    }
else if (discriminant<0){
  System.out.println("there are on real roots");
}
  }
}