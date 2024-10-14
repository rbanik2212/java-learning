package learning;

public class LamdaLearning {

    public static void main(String[] args) {
        printThing(() -> System.out.println("test"));

    }

    private static void printThing(Print test) {
        test.print();
    }
}
