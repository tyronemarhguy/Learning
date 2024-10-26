import java.util.Scanner;
public class multiDimArray {

    public static void askForName(int personNumber){
        System.out.println("Enter the name of Person " + personNumber +": ");
    }

    public static void askForAge(String personName, int personNumber){
        System.out.println("Enter the age of "+ personName + " (Person " + personNumber+ ")  ");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Object[][] people = new Object[3][2];

    String enteredName;
    int enteredAge;
    
        for (int i = 0; i < people.length; i++){
            askForName(i);
            enteredName = scan.next();
            askForAge(enteredName, i);
            enteredAge = scan.nextInt();

            people[i][0] = enteredName;
            people[i][1] = enteredAge;
            
        }
        scan.close();
        System.out.println("-----------------");
        System.out.println("|Name    |Age    |");
        System.out.println("-----------------");
        for (int i = 0; i < people.length; i++){
            System.out.println("|"+people[i][0]+"  | "+people[i][1]+"    |");
        }
        System.out.println("-----------------");
    }

}
