import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner inputAge = new Scanner(System.in);
        System.out.println("Input you're age: ");
        int age = inputAge.nextInt();

        if (age<0) {
            System.out.println("You have entered wrong age. It can't be "+age);
        }
        else if (age>0 && age<18){
            System.out.println("You're underage");
        }
        else if (age>18){
            System.out.println("You have become an adult");
        }
    }

}

