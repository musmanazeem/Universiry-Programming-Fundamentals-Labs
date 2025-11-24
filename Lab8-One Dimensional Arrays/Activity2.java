import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        System.out.println("Enter array element...");
        for (int i=0 ; i < array.length; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Sum of the Given array is..."+sum(array));
    }
    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr){
            s+=x;
            
        }
        return s;        
    }
}
