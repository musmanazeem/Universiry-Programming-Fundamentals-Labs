import java.util.Scanner;
public class LabTask3 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a decimal value (0 to 15) : ");
        int x = sc.nextInt();
        if (x > 0 && x <= 15){
            System.out.println("The Hexa value is "+  Integer.toHexString(x).toUpperCase());
        }
        else{
            System.out.println(x+" is an invalid input ");
        }
        
        System.out.print("Enter a Hexa Digit : ");
        String w = sc.next();
        int y = Integer.parseInt(w, 16);
        String z = Integer.toBinaryString(y);
        System.out.println("The Binary Value is "+z);
    }
}
