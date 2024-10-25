public class buffer {
    public static void main (String[] args){
        StringBuffer name = new StringBuffer();

        for (int i = 0; i < 10; i++){
            name.append("!");
        }
        System.out.println(name);
    }
    
}
