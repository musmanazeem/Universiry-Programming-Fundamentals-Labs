import java.util.Scanner;
public class LabTask8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();
	int num1 = 0;

	num1 = num1 + num%10;
	num =num/10;
	num1 = num1 + num%10;
	num =num/10;
	num1 = num1 + num%10;
	num =num/10;

	System.out.print("The Sum of digits of number is "+num1);
	}
}                                                                                                              