/*The program asks the user to enter the number which pattern he/she wants to print. The loop should ask 
the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise 
it should terminate.*/

import java.util.Scanner;
public class LabTask4{
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = 0;
do{
	System.out.print("\n\nEnter the Pattern You want to Print\n(1) Rectangular\n(2) Left Right Triange\n(3) Right Right Triange\n(4) Equilateral Triange\n(5) Equilateral Triange with Numbers\nYour Choice. (Press 0 to exit) : ");
	n = sc.nextInt();
System.out.println();
	if (n == 1){
	System.out.println(" ************ ");
	System.out.println(" ************ ");
	System.out.println(" ************ ");
	System.out.println(" ************ ");
}
	else if (n == 2){
	System.out.println(" *"); 	
	System.out.println(" **");
	System.out.println(" ***");
	System.out.println(" ****");
	System.out.println(" *****");
}
	else if (n == 3){
	System.out.println("    * "); 	
	System.out.println("   ** ");
	System.out.println("  *** ");
	System.out.println(" **** ");
	System.out.println("***** ");
}
	else if (n == 4){
	System.out.println("    *    "); 	
	System.out.println("   ***   ");
	System.out.println("  *****  ");
	System.out.println(" ******* ");
	System.out.println("*********");
}
	else if (n == 5){
	System.out.println("    1    "); 	
	System.out.println("   222   ");
	System.out.println("  33333  ");
	System.out.println(" 4444444 ");
	System.out.println("555555555");
}
	else if (n == 0 || n < 0 ){
	System.out.println("Program Finished.");
	break;
}
	else{
	System.out.println("Invalid Input");
}
}
	while(n != 0);
	sc.close();
}
}