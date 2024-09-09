public class Basic {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static int sumOfTwo(int a, int b) {
        return a + b;
    }

    public static boolean evenOrOdd(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int lergestNum(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        else if (b > a && b > c) {
            return b;
        }
        else{
            return c;
        }
    }

    public static int factorial( int a){
        for(int i = a; i > 0; i--){
            a *= i ;
        }
        return a;
    }

    public static String reverseStr(String str){
        StringBuilder tmp = new StringBuilder();
        int i = str.length();
        while(i > 0){
            tmp.append(str.charAt(i -1));
            i--;
        }
        return tmp.toString();
    }

    public static boolean palindrome(String str){
        int i = str.length() / 2;

        int j =0, k = str.length() - 1;

        while (i > 0){
            if(str.charAt(j) != str.charAt(k)){
                return false;
            }
            i--;
            j++;
            k--;
        }
        return true;


    }

}
