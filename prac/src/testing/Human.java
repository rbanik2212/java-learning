package testing;

public class Human implements Eating{
    private String name;
    private int age;
    private double height;


    public Human(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "testing.Human{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge()+
                ", height=" + this.height +
                '}';
    }

    public static void main(String[] args) {
        Human raj = new Human("Rajdeep Banik", 23, 6.3);
        System.out.println(raj);
    }

    @Override
    public void eating() {
        System.out.println("I am testing.Eating Food now");
    }
}
