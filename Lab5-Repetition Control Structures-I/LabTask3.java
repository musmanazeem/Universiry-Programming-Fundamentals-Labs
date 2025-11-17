import java.util.Scanner;
public class LabTask3{ 
	static Scanner sc = new Scanner(System.in);
	static final int SENTINEL = 0;
 public static void main(String[] arg){
	 int i, n, j = 0, k;
	System.out.println("Enter the number of integers : ");  
	n = sc.nextInt();

for(i = 1; i <= n; i++){
	System.out.println("Enter the number "+i+": ");
	k = sc.nextInt();
	if (k == SENTINEL){
j++;
}
}
	System.out.println("Output :"+j);
	}
}
