import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashing {

    private void hashText(String s) throws NoSuchAlgorithmException{
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] input = s.getBytes();
        byte[] digest = messageDigest.digest(input);
        System.out.println("input" + s);
         
    }
}
