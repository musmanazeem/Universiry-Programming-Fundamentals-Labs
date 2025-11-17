import java.util.Scanner; 
public class LabTask1 { 
public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
/*------------------------------(a)------------------------------*/
	System.out.println("Enter two integers A ≤ B :");
	int A = sc.nextInt();
        int B = sc.nextInt();
        while( A <= B ){
        System.out.print(A +" ");
	A++;
	}
	System.out.println(" ");
/*------------------------------(b)------------------------------*/
	System.out.println("\nEnter two integers A ≤ B or  A ≥ B  : ");
	A = sc.nextInt();
        B = sc.nextInt();
	if (A < B){
	while (A <= B){
	System.out.print(A + " ");
	A++;
  }
  }	
	else if (A > B){
	while (A >= B){
	System.out.print(A + " ");
	A--;
  }
  }
	else{
	System.out.print("A");
  }
	System.out.println(" ");
/*------------------------------(c)------------------------------*/
	int n;
	int number; 
	int sum; 
	int i;

	System.out.print("\nEnter the number of " + "integers in the list: "); 
	n = sc.nextInt();
	sum = 0; 
	i = 0; 
	System.out.println("Enter " + n + " integers.");  

	while (i < n){ 
	number = sc.nextInt(); 
	sum = sum + number; 
	i++;  
} 
	System.out.printf("The sum of the %d "+"numbers= %d%n", n, sum); 
	System.out.println("");  
/*------------------------------(d)------------------------------*/
	System.out.println("Give an Integer N :");
	n = sc.nextInt();
	int m = 0 ;
	while (n >= 1){
	m += Math.pow(n, 3);
	n--;
  }
	System.out.println(m);
	sc.close;
	}
}