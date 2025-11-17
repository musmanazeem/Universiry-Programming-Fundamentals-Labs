import java.util.Scanner;
public class LabTask1{
	public static void main(String [] args){

	Scanner scanner = new Scanner(System.in);

	int cents;
	int dollars;
	int quarters;
	int dimes;
	int nickels;
	int pennies;
	double amount;

	System.out.print("Enter an amount: ");
	amount = scanner.nextDouble();

	cents = (int)Math.round(amount*100);

	dollars = cents / 100;
	cents = cents%100;

	quarters = cents / 25;
	cents = cents%25;

	dimes = cents / 10;
	cents = cents%10; 

	nickels = cents / 5;
	cents = cents%5; 

	pennies = cents/1;

	System.out.println("Dollars: "+dollars);
	System.out.println("Quarters: "+quarters);
	System.out.println("Dimes: "+dimes);
	System.out.println("Nickels: "+nickels);
	System.out.println("Pennies: "+pennies);

	scanner.close();
	}
}



