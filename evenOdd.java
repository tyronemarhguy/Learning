import java.util.Scanner;

public class evenOdd{

    public static boolean checkIfEven(int x){
        return x % 2 == 0;

    }
    public static void main(String[] args){
        Scanner accept = new Scanner(System.in);

        System.out.print("Enter a number to verify if it is even or odd: ");


        String input_value = accept.next();

        accept.close();

        try{

            int number = Integer.parseInt(input_value);
        
        System.out.println("Is the number "+ number +" even? Answer: " +checkIfEven(number));

        }catch (Exception e){
            System.out.println("You entered a wrong character!");

        }
        
    }
}