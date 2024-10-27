import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pass{

    //verifies a password complexity
    //must have uppercase, lowercase, number and length of 6+

    public static boolean checker(String pass){
        //creates a list object called password
        List<Character> password = new ArrayList<>();

        //coverts password to individual characters
        for (char element: pass.toCharArray()){
            password.add(element);
        }

        //conditions to be met, set to default false each
        boolean hasValidLength = (password.size() >= 6);
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasLower = false;

        //Iterator to run through password
        for (char currentChar: password){
            if (Character.isDigit(currentChar)){
                hasNumber = true; }

            if (Character.isUpperCase(currentChar)){
                hasUpper = true;}

            if (Character.isLowerCase(currentChar)){
                hasLower = true;
            }
        }  
        return hasLower && hasNumber && hasUpper && hasValidLength; 
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter password to check complexity: ");
        String password = scan.next();
        scan.close();

        System.out.println("Password test: "+checker(password));
    }
  
}