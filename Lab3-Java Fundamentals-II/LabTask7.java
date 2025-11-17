import java.util.Scanner;
public class LabTask7{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("How manny Tickets of Category A Sold? ");
	int numA = scanner.nextInt();
	int salesA = numA*20;

	System.out.print("How manny Tickets of Category B Sold? ");
	int numB = scanner.nextInt();
	int salesB = numB*15;

	System.out.print("How manny Tickets of Category C Sold? ");
	int numC = scanner.nextInt();
	int salesC = numC*10;

	System.out.print("How manny Tickets of Category D Sold? ");
	int numD = scanner.nextInt();
	int salesD = numD*5;

	System.out.println("Income from Category A: $"+ salesA);
	System.out.println("Income from Category B: $"+ salesB);
	System.out.println("Income from Category C: $"+ salesC);
	System.out.println("Income from Category D: $"+ salesD);
	System.out.println("Total Revenue: $"+ (salesA+salesB+salesC+salesD));

	scanner.close();
	}
}