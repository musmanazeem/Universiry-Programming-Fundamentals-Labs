import java.util.Scanner;
public class LabTask3{
	public static void main(String[]args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Number of Students in class A: ");
	int classA = scanner.nextInt();

	int deskA = (classA/2)+(classA%2);

	System.out.print("Number of Students in class B: ");
	int classB = scanner.nextInt();

	int deskB = (classB/2)+(classB%2);

	System.out.print("Number of Students in class C: ");
	int classC = scanner.nextInt();

	int deskC = (classC/2)+(classC%2);

	int totalDesks = deskA+deskB+deskC;

	System.out.println("The smallest possible number of desks that can be purchased are "+totalDesks+".");
	scanner.close();
	}
}
