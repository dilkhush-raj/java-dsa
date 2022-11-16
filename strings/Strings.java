package strings;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        //Strings are IMMUTABLE
        try (
        Scanner sc = new Scanner(System.in)) {
            String name;
            name = sc.next();
            System.out.println(name);
        }
        String fullName = "Dilkhush Raj";
        System.out.println(fullName.length());
    }
}
