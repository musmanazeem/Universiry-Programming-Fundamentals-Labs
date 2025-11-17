import java.util.*; 
public class Activity3{
	static Scanner sc = new Scanner(System.in);
	static final int SENTINEL = -999;
	public static void main(String [] args){

	int  number, sum = 0, count = 0;

	System.out.println("Enter positive integers "+ "ending with " + SENTINEL);
	number = sc.nextInt();
	while (number != SENTINEL){
	sum = sum + number;
	count++;
	number = sc.nextInt();
  }
	System.out.printf("The sum of %d "+"numbers = %d%n", count, sum);

	if (count != 0){
	System.out.printf("The average = %d%n "+"numbers = ", count, sum);
  }
	else
	System.out.println("No Input.");
	}
}