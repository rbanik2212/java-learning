package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        User testuser = new User.Builder("RAJDEEP", 12).build();
        User testuser2 = new User.Builder("RAJDEEP", 12).email("rbanik2212@gmail.com").school("DCU").build();
        System.out.println(testuser);
    }
}
