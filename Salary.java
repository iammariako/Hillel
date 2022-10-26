import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner inputYears = new Scanner(System.in);
        System.out.println("Input the number of years the employee has worked: ");
        float years = inputYears.nextFloat();
        Scanner inputSalary = new Scanner(System.in);
        System.out.println("Input the salary of the employee: ");
        float salary = inputSalary.nextFloat();
        double salaryIncrease;
        double bonus;

        if(years<1){
            System.out.println("Employee's salary will not change");
        }
        else if (years>=1 && years<=3) {
            salaryIncrease=salary+(salary*0.1);
            if(salaryIncrease<4000){
                bonus=salaryIncrease+1000;
                System.out.println("Employee will receive $" + bonus);
            }
            else if (salaryIncrease>4000) {
                bonus=salaryIncrease+500;
                System.out.println("Employee will receive $" + bonus);
            }
        }
        else if (years>3) {
            salaryIncrease=salary+(salary*0.2);
            if(salaryIncrease<4000){
                bonus=salaryIncrease+1000;
                System.out.println("Employee will receive $" + bonus);
            }
            else if (salaryIncrease>4000) {
                bonus=salaryIncrease+500;
                System.out.println("Employee will receive $" + bonus);
            }
        }
    }
}
