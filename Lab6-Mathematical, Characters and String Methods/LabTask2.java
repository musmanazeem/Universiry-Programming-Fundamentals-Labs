import java.util.Scanner;
public class  LabTask2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ASCII code : ");
        int x = sc.nextInt();

        char y = (char)x;
        System.out.println("The character for ASCII code "+x+" is "+y);

        System.out.print("Enter a Character : ");
        char i = sc.next().charAt(0);

        int j = i;
        System.out.println("The Unicode for Character "+i+" is "+j);
        sc.close();
    }
}