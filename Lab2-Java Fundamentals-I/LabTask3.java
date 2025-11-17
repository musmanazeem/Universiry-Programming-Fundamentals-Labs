import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final int SECRET = 11;
        final double RATE = 12.50;
        
        int num1;
        int num2;
        int newNum;
        String name;
        double hoursWorked;
        double wages;
        
        System.out.print("Enter an integer Num1: ");
        num1 = console.nextInt();
        System.out.print("Enter an integer Num2: ");
        num2 = console.nextInt();
        
        System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2);
        
        newNum = (num1 * 2) + num2;
        System.out.println("The value of newNum = " + newNum);
        
        newNum += SECRET;
        System.out.println("The UPDATED value of newNum = " + newNum);
        
        console.nextLine();
        System.out.print("What is your last name? ");
        name = console.nextLine();
        
        System.out.print("Enter hours worked (Range 0-70): ");
        hoursWorked = console.nextDouble();
        
        wages = hoursWorked * RATE;
        
        System.out.println("Name: " + name);
        System.out.println("Pay Rate: $" + RATE);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: $" + wages);
    }
}