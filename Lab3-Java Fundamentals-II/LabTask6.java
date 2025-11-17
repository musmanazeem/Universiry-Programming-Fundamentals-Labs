import java.util.Scanner;
public class LabTask6{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the pay rate for an hour: ");
	int rate = scanner.nextInt();
	System.out.print("Enter the number of hours you worked per day: ");
	int time = scanner.nextInt();
	int totalTime = 5*7*time; 
	int pay = totalTime*rate;
	System.out.println("Pay before Tax Deduction: $"+pay);

	int tax = pay*14/100;
	pay = pay-tax;
	System.out.println("Pay after Tax Deduction: $"+pay );
	
	int expense = pay*1/10;
	System.out.println("Expenditures on Clothing and Accessories: $"+expense );
	
	int schoolSupplies = pay*1/100;
	System.out.println("Expense on School Supplies: $"+schoolSupplies );
	pay = pay-schoolSupplies;
	int saving = pay*25/100;
	System.out.println("Self Saving: $"+saving);
	int parentSaving = saving*50/100;
	System.out.println("Parents Saving: $"+parentSaving);
	saving = saving+parentSaving;
	System.out.println("Collective Saving: $"+saving);

	scanner.close();
	}
}