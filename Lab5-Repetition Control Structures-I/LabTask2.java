import java.util.Scanner;
public class LabTask2{ 
 public static void main(String[] arg){ 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an integer n to calculate n! : ");
	int n = sc.nextInt();
       	System.out.println("");

	int i = 1;
	int facto = 1; 
	while (i <= n){
	facto *= i;
	i++;
  }
	System.out.print("n! of "+n+" is "+facto);
	}
}