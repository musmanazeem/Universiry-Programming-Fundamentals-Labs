import java.util.Scanner;
public class LabTask9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String x = sc.nextLine();

        int first = x.indexOf('h');
        int last  = x.lastIndexOf('h');

        if (first == -1 || first == last) {
            System.out.println(x);
        }
        String part1 = x.substring(0, first + 1);
        String middle = x.substring(first + 1, last);
        middle = middle.replace('h', 'H');
        String part3 = x.substring(last);

        String result = part1 + middle + part3;
        System.out.println(result);
        sc.close();
    }
}   
