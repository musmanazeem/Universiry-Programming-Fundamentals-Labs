import java.util.Scanner;
public class LabTask2{
	public static int reverse(int x){
		int rev = 0;
		while (x != 0){
		int digit = x % 10;
		rev = rev * 10 + digit;
		x /= 10;
		}
		return rev;
	}

	public static boolean isPalindrome(int x){
	return x == reverse(x);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer to displays its reversal : ");
		int number = sc.nextInt();
		System.out.print("\nReverse of the digits of the integer : "+ reverse(number));
		System.out.print("\nThe integer is a Palindrome  : "+ isPalindrome(number));
		sc.close();
	}
}
