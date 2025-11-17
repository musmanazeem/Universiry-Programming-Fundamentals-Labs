import java.util.Scanner;
public class LabTask6{
public static void main(String [] args){
	int x;
	String result;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number (1-10) : ");
	x = sc.nextInt();
	
	if( x <= 10 && x > 0 ){
result = (x == 1) ? "I" :
	 (x == 2) ? "II" :
	 (x == 3) ? "III" :
	 (x == 4) ? "IV" :
	 (x == 5) ? "V" :
	 (x == 6) ? "VI" :
	 (x == 7) ? "VII" :
	 (x == 8) ? "VIII":
	 (x == 9) ? "IX" : "X" ;
	
	System.out.println("Roman Numeral :"+result);
  }
	else{
	System.out.println("INVALID INPUT");

  }
	}
}