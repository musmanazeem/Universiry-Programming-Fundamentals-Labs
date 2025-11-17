import java.util.Scanner;
public class LabTask1{
	public static int sumDigits(long n){
		int y = 0;
		while (n != 0){
		long digit = n % 10;
		y += digit;
		n /= 10;
		}
		return y;
	}
	public static void reverse(int number){
		int rev = 0;
		while (number != 0){
		int digit = number % 10;
		rev = rev * 10 + digit;
		number /= 10;
		}
		System.out.print("Reverse of the digits of the integer : "+ rev);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Compute the sum of the digits in an integer : ");
		long x = sc.nextLong();
		System.out.print("Sum of the digits in an integer : "+ sumDigits(x));
		System.out.print("\nEnter an integer to displays its reversal : ");
		int y = sc.nextInt();
		reverse(y);
		sc.close();
	}
}