import java.sql.SQLOutput;
import java.util.Scanner;

public class GPA {

    public static void main(String[] args) {
        double math,eng,lit;
        String name = "Hello";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = input.next();
        System.out.println("Enter your mathematic grade: ");
        math = input.nextDouble();
        System.out.println("Enter your english grade: ");
        eng = input.nextDouble();
        System.out.println("Enter your literature grade: ");
        lit = input.nextDouble();
        double gpa = (math + eng + lit) / 3;

        System.out.printf("Name: %s%n", name);
        System.out.printf("GPA: %f", gpa);
    }
}
