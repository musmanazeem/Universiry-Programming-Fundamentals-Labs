import java.util.Scanner;
public class LabTask7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    String x = sc.nextLine();
    int first = x.indexOf('f');
    int last = x.lastIndexOf('f');
    if (first !=-1) {
        if (first == last) {
            System.out.println(first);
        }
        else {
        System.out.println(first + " " + last);
        }
    }
    }
}