import java.util.Scanner;
public class LabTask9{
public static void main(String [] args){

	int pennies, nickels, dimes, quaters;
	Scanner sc = new Scanner(System.in);

	System.out.print("Pennies : ");
	pennies = sc.nextInt();

	System.out.print("Nickels : ");
	nickels = sc.nextInt();

	System.out.print("Dimes : ");
	dimes = sc.nextInt();

	System.out.print("Quaters : ");
	quaters = sc.nextInt();

	pennies = (pennies + (nickels * 5) + (dimes * 10) + (quaters * 25));
	double dollars = (double)(pennies/100);

	if ( dollars == 1){ 
	System.out.println("Congratulation for winning the game");
}
	else if ( dollars > 1){
	System.out.println("Amount entered is more than one dollar");
}
	else{
	System.out.println("Amount entered is less than one dollar");
}

	sc.close();
	}
}