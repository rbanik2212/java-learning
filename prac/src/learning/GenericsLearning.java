package learning;

public class GenericsLearning {

    public static <T extends String> void add(T a, T b){
        T num = a;
        T num2 = b;
        if (num == num2){
            System.out.println(num);
        }else {
            System.out.println("not what you expected");
        }
    }


    public static void main(String[] args) {
        GenericsLearning.add("12", "12");

    }
}
