package testing;

public class Raj extends Human implements Tall{
    public Raj(String name, int age, double height) {
        super(name, age, height);
    }

    public String getJob(){
        return "General Motors";
    }

    @Override
    public void tall() {
        if (this.getHeight() > 6.0){
            System.out.println("i am tall");
        }
        else {
            System.out.println("I am small");
        }
    }
}
