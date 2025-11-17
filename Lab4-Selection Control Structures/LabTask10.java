import java.util.Scanner;
public class LabTask10{
public static void main(String [] args){

	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of books you bought : ");
	int books = sc.nextInt();

	if (books == 0 ){
	System.out.print("You earned 0 points.");
  }
	else if(books == 1 ){
	System.out.print("You earned 5 points.");
  }
	else if(books == 2){
	System.out.print("You earned 15 points.");
  }
	else if(books == 3){
	System.out.print("You earned 30 points.");
  }
	else if(books >= 4){
	System.out.print("You earned 60 points.");
  }
	sc.close();
	}
}