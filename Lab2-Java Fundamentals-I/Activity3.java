import java.util.*;
public class Activity3{
static Scanner console = new Scanner(System.in);

	public static void main(String [] args){

	String firstName;
	String lastName;
	int age;
	double weight;

	System.out.println("Enter First Name, Last name," + "age, and weight seperated" + "by spaces.");
	
	firstName = console.next();
	lastName = console.next();
	age = console.nextInt();
	weight = console.nextDouble();

  System.out.println("Name :" + firstName+ " " + lastName);
  System.out.println("Age :" + age);
  System.out.println("Weight :" + weight);
	}
}