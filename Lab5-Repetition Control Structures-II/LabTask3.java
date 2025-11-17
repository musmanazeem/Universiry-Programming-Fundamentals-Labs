/*The number of elements that are greater than the previous one: A sequence consists of integer numbers and ends with the number 0. Determine how many elements of this sequence are greater than their neighbours above. */

import java.util.Scanner;
public class LabTask3{
	static final int SENTINEL = 0;
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args){

	int first ;
	int second ;
	int i = 0 ;

	System.out.print("Enter a Sequence ending with the number 0 : ");
	first = sc.nextInt();

	while(true){
	second = sc.nextInt();

	if(second == SENTINEL ){
	break;
}
	if(first < second){
		first = second;
		i++;
	}
}
	System.out.print("The number of elements that are greater than the previous one : "+ i);
	}
}