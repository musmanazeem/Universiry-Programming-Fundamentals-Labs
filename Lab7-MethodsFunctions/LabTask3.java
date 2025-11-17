import java.util.Scanner;
public class LabTask3{
	public static void displaySortedNumbers(double x, double y, double z){
	double temp;
	if(x > y){
		temp = y;
		y = x;
		x = temp;
	}
	if(y > z){
		temp = z;
		z = y;
		y = temp;
	}
	if(x > y){
		temp = y;
		y = x;
		x = temp;
	}
	System.out.println("Numbers in increasing order: " + x + ", " + y + ", " + z);
	}
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Three Double Integers to Sort : ");
	double num1 = sc.nextDouble();
	double num2 = sc.nextDouble();
	double num3 = sc.nextDouble();
	displaySortedNumbers(num1, num2, num3);
	sc.close();
	}
}
