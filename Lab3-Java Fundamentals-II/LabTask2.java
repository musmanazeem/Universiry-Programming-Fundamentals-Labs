import java.util.Scanner;
public class LabTask2{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("The Number of students (N): "); 
	int students = scanner.nextInt();
	System.out.print("The Number of apples (K): ");
	int apples = scanner.nextInt();
	

	int distributed = apples/students;
	int remaining = apples%students;

	System.out.println("Number of Apple(s)/student: "+distributed);
	System.out.println("Number of Apples remaining: "+remaining);

	scanner.close();
	}
}