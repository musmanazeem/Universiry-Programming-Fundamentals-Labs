/*The index of the maximum of a sequence: A sequence consists of integer numbers and ends with the number 0.
Determine the index of the largest element of the sequence. 
If the highest element is not unique, print the index of the first of them. */

import java.util.Scanner;
public class LabTask1{
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int max = 0, num = 1, index = 0, maxIndex = 1;
	System.out.print("Enter a Sequence ending with the number 0 : "); 	
	while(true){
	num = sc.nextInt();
	index++;

	if (num == 0){
	break;
}
	if (max < num){
	max = num;
	maxIndex = index;
}
	if (max < num){
	max = num;	
}

}
	System.out.println("Index of the Maximum Number of Sequence :"+ maxIndex); 	
	}
}