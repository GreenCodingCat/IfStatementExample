
package pkgif.statement.example;
import java.util.Scanner;

public class IfStatementExample {

   
    public static void main(String[] args) {
        
        int age;
        Scanner reader = new Scanner(System.in);
        
        System.out.println ("Please enter an age: ");
        age = reader.nextInt();
        
        if (age <= 3){
            System.out.println ("Take a nap, stop whining!");
        }
        else if (age <= 12) { //if (age <= 12 && age > 3)
            System.out.println("Learn your math!");
        }
        else if (age < 18){
            System.out.println ("Emo Trashcan");
        }
        else if (age < 65){
            System.out.println ("Hope you don't still live with your parents");
        }
        else if (age < 85){
            System.out.println ("Ok, Boomer...");
        }
        else if (age < 100){
            System.out.println ("Take a nap, stop Whining.");
        }
        else{
            System.out.println("Thanks for being an Idiot and typing an unatural age!!");
            
        }
        
    }
    
}
