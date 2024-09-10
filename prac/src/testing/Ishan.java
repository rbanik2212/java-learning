package testing;

public class Ishan extends Doctor{

    public Ishan(String name, int age, double height, String university) {
        super(name, age, height, university);
    }

    public String toString(){
        return "i am " + this.getPractice();
    }

}
