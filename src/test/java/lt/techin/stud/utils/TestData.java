package lt.techin.stud.utils;
import java.util.Random;

public class TestData {

    public static String generateRandomUsername() {
        return "user" + new Random().nextInt(1000);
    }

    public static String generateRandomPassword() {
        return "pass" + new Random().nextInt(1000);
    }

    public static String generateRandomEmail() {
        return "email" + new Random().nextInt(1000) + "@example.com";
    }
}
