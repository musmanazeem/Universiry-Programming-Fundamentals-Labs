import java.util.Scanner;
public class LabTask5{
public static void main(String [] args){

	int x, y, z;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 values (Same or Different)");
	System.out.print("Enter x : ");
	x = sc.nextInt();
	System.out.print("Enter y : ");
	y = sc.nextInt();
	System.out.print("Enter z : ");
	z = sc.nextInt();

	if (x == y  && y == z && x == z){
	System.out.print("3");
  }
	else if (x == y || y == z || x == z ){
	System.out.print("2");
  }
	else{
	System.out.print("0");
  }
	sc.close();
	}
}