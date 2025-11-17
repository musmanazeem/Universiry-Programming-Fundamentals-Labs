import java.util.Scanner;
public class Activity3{
 public static void main(String[] args){
	int sum = 0;
	int number = 0;
	while(number < 20){
		number++;
		sum += number;
		if (sum >= 100)
		break;
	}
	System.out.println("The Number is " +number); 
	System.out.println("The Sum is " + sum); 	
	}
}