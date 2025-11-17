import java.util.Scanner;
public class LabTask4{
	static Scanner sc = new Scanner(System.in);
	static final int SENTINEL = 0;
   public static void main(String[] args) {
        int number;
        int length = 0;

	System.out.println("Enter sequence (each number on a new line, end with 0):");
        number = sc.nextInt();
        while (number != SENTINEL) {
	length++;
	number = sc.nextInt();
}

	System.out.println("Length of the sequence: " + length);
	}
}