import java.util.*;

public class Array {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student Marks: ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Python Marks: " + marks[0]);
        System.out.println("Java Marks: " + marks[1]);
        System.out.println("C++ Marks: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage: " + percentage + "%");

    }
}
