import java.util.*;

public class ArrayCC {
    public static void main (String args[]) {
        int marks[] = new int[100];

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter marks of physics : ");
            marks[0] = sc.nextInt();
            System.out.print("Enter marks of chemistry : ");
            marks[1] = sc.nextInt();
            System.out.print("Enter marks of math : ");
            marks[2] = sc.nextInt();
        }

        System.out.println("------------------------");
        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Math : " + marks[2]);
        System.out.println("------------------------");
    }
}
