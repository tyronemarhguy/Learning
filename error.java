import java.util.Scanner;

public class error {
    public static void main(String[] args){
    Scanner accept = new Scanner(System.in);
    String ERROR_MESSAGE = "Number is odd!!";

   // int number = Integer.parseInt(args[0]);
    int number = accept.nextInt();
    accept.close();

    //if number is odd, throw an error

    try{
        if (number %2 != 0){
            throw (new Exception (ERROR_MESSAGE));
        }

    }
    catch (Exception messag){
        System.out.println(ERROR_MESSAGE);
    }

    }
    
}
