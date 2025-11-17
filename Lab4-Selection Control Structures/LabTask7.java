import java.util.Scanner;
public class LabTask7{
public static void main(String [] args){
	int x, y, x1, y1, area, area1;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Length of Rectangle 1 : ");
	x = sc.nextInt();
	System.out.print("Enter a Width of Rectangle 1 : ");
	y = sc.nextInt();
	
	System.out.print("Enter a Length of Rectangle 2 : ");
	x1 = sc.nextInt();
	System.out.print("Enter a Width of Rectangle 2 : ");
	y1 = sc.nextInt();

	area = x * y;
	area1 = x1 * y1;

	if(area > area1){
	System.out.println("Area of Rectangle 1 is Greater");
}
	else
	System.out.println("Area of Rectangle 2 is Greater");
	}
}