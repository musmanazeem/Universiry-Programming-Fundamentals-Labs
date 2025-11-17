import java.util.Scanner;
public class LabTask7 {
    public static void printMatrix(int n){
        int j;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++){
                j = (int) (Math.random() * 2);
                System.out.print(j+ " ");
            }
            System.out.println("");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int a = sc.nextInt();
        printMatrix(a);
        sc.close();
    }
}
