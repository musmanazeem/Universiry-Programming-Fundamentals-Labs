import java.util.*;
public class LabTask10 {
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String x = sc.nextLine();
        System.out.println(x.charAt(2));
        System.out.println(x.charAt((x.length())-2));
        System.out.println(x.charAt(0) +""+ x.charAt(1) +""+ x.charAt(2) +""+ x.charAt(3) +""+ x.charAt(4));
        for(int i = 0; i < x.length()-2 ; i++ ){
            System.out.print(x.charAt(i));
        }
        System.out.println("");
        for(int i = 0; i < x.length(); i++ ){
            if (i == 0 || i % 2 == 0){
                System.out.print(x.charAt(i));
            }
        }
        System.out.println("");
        for(int i = 0; i < x.length(); i++ ){
            if ( i % 2 != 0){
                System.out.print(x.charAt(i));
            }
        }
        System.out.println("");
        for (int i = x.length() - 1; i >= 0; i--) {
        System.out.print(x.charAt(i));
        }
        System.out.println("");
        for (int i = x.length() - 1; i >= 0; i-=2 ) {
        System.out.print(x.charAt(i));
        }
        System.out.println("");
        System.out.println(x.length());            
        sc.close();
    }   
}
