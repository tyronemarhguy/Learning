import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args){
    ArrayList <Integer> even_numbers = new ArrayList<Integer>();

    for (int i = 0; i<50; i++){
        if (i % 2 == 0){
        even_numbers.add(i);
        }
    }

    for (Integer g = 0; g < even_numbers.size(); g++){
        System.out.print(even_numbers.get(g) + "  ");
    }
}  
}
