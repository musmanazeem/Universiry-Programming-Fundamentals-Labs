/*The number of even elements of the sequence: Determine the number of even elements in the sequence ending with the number 0*/

import java.util.Scanner;
public class LabTask2{
 public static void main(String[] args){
	int even = 0;
	int num = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Sequence ending with the number 0 : "); 	

	while(true){
	num = sc.nextInt();
	if (num == 0)
	break;

	if (num%2 == 0){
	even++;	
}
}
	System.out.println("Even Numbers in the Sequence :"+even); 	
	sc.close();
}
}