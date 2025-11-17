import java.util.Scanner;
public class LabTask5{ 
	static Scanner sc = new Scanner(System.in);
	static final int SENTINEL = 0;
  public static void main(String[] arg){
	int number = 1, max = 1;
	System.out.println("Enter Sequence (numbers separated by spaces) : ");
	


	do{ 
	if ( max < number )
	max = number;
	number = sc.nextInt();
	}

	while( number != SENTINEL );

	System.out.println("Maximum of the Sequence : "+max);
	}
}
	