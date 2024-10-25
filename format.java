import java.text.NumberFormat;
import java.util.Locale;

public class format{
    public static void main(String[] args){

        @SuppressWarnings("deprecation")
        Locale ghana = new Locale("en", "GH");

        double price = 98288.45;

        NumberFormat real = NumberFormat.getIntegerInstance(ghana);
       System.out.println( real.format(price));




    }
}