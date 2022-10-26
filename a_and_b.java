import java.util.Scanner;

public class a_and_b {
    public static void main(String[] args) {

        Scanner inputA = new Scanner(System.in);
        System.out.println("Input first number: ");
        double a = inputA.nextDouble();
        Scanner inputB = new Scanner(System.in);
        System.out.println("Input second number: ");
        double b = inputB.nextDouble();

        double remainder = (a % b);
        if (remainder != 0) {
            System.out.println("Divided with the remainder " + remainder);
        } else {
            System.out.println("Divides, the result of division: " + (a / b));
        }
    }
}

























