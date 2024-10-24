public class Penndir implements person {
    String lname;
    String fname;
    int age;

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lname){
        this.lname = lname;

    }
    @Override
    public void setFirstName(String fname) {
        this.fname = fname;
    }

    @Override
    public int getAge() {
        return this.age;
    }
    
    @Override
    public String getFirstName() {
        return this.fname;
    }

    @Override
    public String getLastName() {
        return this.lname;
    }

    public static void main (String[] args){

        Penndir tyrone = new Penndir();

        tyrone.setAge(20);
        tyrone.setFirstName("Tyrone");
        tyrone.setLastName("Marhguy");

        System.out.println(tyrone.getLastName());

    }
}
