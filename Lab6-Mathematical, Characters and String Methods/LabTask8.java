import java.util.Scanner;
public class LabTask8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string containing 'h' at least twice:");
	String x = sc.nextLine();
        int firstH = x.indexOf('h');
        int lastH = x.lastIndexOf('h');
        String before = x.substring(0, firstH);
        String after = x.substring(lastH + 1);
        String result = before + after;
        System.out.println("Result: " + result);
        sc.close();
        }
}