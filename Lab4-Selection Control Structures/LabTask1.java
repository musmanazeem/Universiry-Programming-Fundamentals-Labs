public class LabTask1{
	public static void main(String [] args){
	int x, y, z;

	x = 10;
	y = 15;
	z = 20;	

	boolean expression1 = !(x > 10);
	System.out.println("Expression 1 : "+ expression1);

	boolean expression2 = x <= 5 || y < 15 ;
	System.out.println("Expression 2 : "+ expression2);

	boolean expression3 = (x != 5)&&(y != z);
	System.out.println("Expression 3 : "+ expression3);

	boolean expression4 = x >= z || ((x+y) >= z);
	System.out.println("Expression 4 : "+ expression4);

	boolean expression5 = (x <= (y-2)) && (y >= z) || ((z-2) != 20) ;
	System.out.println("Expression 5 : "+ expression5);
		}
}