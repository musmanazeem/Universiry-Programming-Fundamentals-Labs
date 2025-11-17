import java.util.Scanner;
public class LabTask8{
public static void main(String [] args){
	int x, y, z;
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter day of month(1 - 31) : ");
	x = sc.nextInt();
	System.out.print("Enter the month(1 - 12) : ");
	y = sc.nextInt();
	System.out.print("Enter the year (Last two digits) : ");
	z = sc.nextInt();

	if (x * y == z){
	System.out.print("The date is Magic.");
  }
	else {
	System.out.print("The date is not Magic.");
  }

	sc.close();
	}
}