import java.util.ArrayList;
import java.util.List;



public class arralist {

    public static List<Integer> evens (){
        List <Integer> result = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            if(i % 2 == 0){
                result.add(i);
            }
        }
        return result;

    }
    public static void main(String[] args){
        String err = "Number is bigger than 50";

        List <Integer> even_numbers = new ArrayList<>();

        even_numbers = evens();

        for (int number: even_numbers){
            try{
                System.out.print(Integer.toString(number) + " ");
                if(number > 50){
                    throw (new Exception (err));
                }
            
            }catch (Exception x){
                System.out.println(x.getMessage());
            }
        }

    }
    
}
