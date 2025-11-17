import java.util.Scanner;
public class LabTask5{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the total amount of milk produced in the morning: ");
	double milkProduced = scanner.nextDouble();

	int milkCartons = (int)Math.round(milkProduced/3.78);

	double cost = milkCartons*0.38;
	double profit = milkCartons*0.27;

	System.out.println("Number of milk cartons produced: "+milkCartons);
	System.out.println("Cost of producing milk: $"+cost);
	System.out.println("Profit for producing milk: $"+ profit);
	}
}