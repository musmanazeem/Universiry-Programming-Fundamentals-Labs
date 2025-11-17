import java.util.Scanner;
public class LabTask5 {
    public static int countLetters(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) { 
        char ch = s.charAt(i);
        if (Character.isLetter(ch)) {
            count++;
        }
    }
     return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String x = sc.nextLine();
        System.out.println("Number of Letters in the string : "+countLetters(x));
        sc.close();
    }
}
