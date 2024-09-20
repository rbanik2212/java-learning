package testing;

public class XOR {

    public static void main(String[] args) {
        int num = 4;
        int num2 = 3;

        String binaryString = Integer.toBinaryString(num ^ num2);

        System.out.println(Integer.parseInt(binaryString, 2));

    }



}
