import java.util.Scanner;
public class LabTask5{
    public static String reverse(String x){
        String y = ""; 
        for (int i = (x.length()-1); i >= 0; i-- ){
            y += x.charAt(i);
        }
        return y;
    }
    public static void isPalindrome(String x){
        if (x.equals(reverse(x))){
            System.out.println(x+" is a Palindrome.");
        }
        else{
            System.out.println(x+" is not a Palindrome.");
        }      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String a = sc.nextLine();
        isPalindrome(a);
        sc.close();
    }
}