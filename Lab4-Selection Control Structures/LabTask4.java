import java.util.Scanner;
public class LabTask4{
public static void main(String [] args){

	int x, y, z, temp;
	String result;
	Scanner sc = new Scanner(System.in);

	System.out.println("  Minimum of two numbers  ");
	System.out.print("Enter an Integer X = ");
	x = sc.nextInt();
	System.out.print("Enter an Integer Y = ");
	y = sc.nextInt();

	result = (x < y) ? "X is less" : (x > y) ? "Y is Less" : "X & Y are equal";
	System.out.println(result);
 
	System.out.println("  Maximum of two numbers  ");
	System.out.print("Enter an Integer X = ");
	x = sc.nextInt();
	System.out.print("Enter an Integer Y = ");
	y = sc.nextInt();

	result = (x > y) ? "X is greater" : (x < y) ? "Y is greater" : "X & Y are equal";
	System.out.println(result);


	System.out.println("  Sign Function  ");
	System.out.print("Enter an Integer X = ");
	x = sc.nextInt();

	result = (x>0) ? "1" : (x<0) ? "-1" : "0";
	System.out.println(result);
  
	System.out.println("  Smallest of Three numbers  ");
	System.out.print("Enter an Integer X = ");
	x = sc.nextInt();
	System.out.print("Enter an Integer Y = ");
	y = sc.nextInt();
	System.out.print("Enter an Integer Z = ");
	z = sc.nextInt();
	  
	temp = Math.min(x, Math.min(y, z));
	System.out.print("Minimum = "+temp);
 
	sc.close();	  
	}
}
