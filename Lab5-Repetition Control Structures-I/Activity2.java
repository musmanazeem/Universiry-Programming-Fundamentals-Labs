import java.util.*; 
public class Activity2{ 
  public static void main(String [] args){ 

	Scanner sc = new Scanner(System.in);
	int limit;
	int number;
	int sum;
	int counter;
	System.out.print("Enter the number of " + "integers in the list: ");
	limit = sc.nextInt();

	System.out.println();
	sum = 0;
	counter = 0;
	System.out.println("Enter " + limit+ " integers.");

	while (counter < limit){
	  number = sc.nextInt();
	  sum = sum + number;
	  counter++;
  }
	System.out.printf("The sum of the %d "+"numbers= %d%n", limit, sum);
	if (counter != 0){
	System.out.printf("The average = %d%n",(sum / counter));
  }
	else
	System.out.println("No input.");

	sc.close();
	}
}