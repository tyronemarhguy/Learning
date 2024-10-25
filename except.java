import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class except {
    public static void main(String[] args) {
        try {
            System.out.print("Enter a number: ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            scan.close();

            int[] numbers = new int[12];

            // Fill the numbers array with incremented values
            for (int i = 0; i < numbers.length; i++) {
                number += 2; // Increment number by 2
                numbers[i] = number; // Assign the incremented number
            }

            // Create a list of lists
            List<List<String>> finals = new ArrayList<>(); 
            finals.add(new ArrayList<>()); // Initialize the first List

            // Add calculated values to the first List
            for (int j = 0; j < numbers.length; j++) {
                finals.get(0).add(Integer.toString(2 * numbers[j])); // Correctly add to the List
            }

            // Print the contents of the first List
            System.out.println("Final ArrayList contents: " + finals.get(0));
            
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
