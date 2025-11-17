public class LabTask2{
	public static void main(String [] args){
	int x, y, z, w;

	x = 3;
	y = 4;
	z = 7;	
	w = 1;
	boolean expression1 = (x == y );
	boolean expression2 = (x != z ) ;
	boolean expression3 = (y == z - 3);
	boolean expression4 = ! (z > w);
	boolean expression5 = (x + y < z);

	System.out.println("x == y: " + expression1); 
	System.out.println("x != z: " + expression2 ); 
	System.out.println("y == z - 3: " + expression3); 
	System.out.println("!(z > w): " +expression4); 
	System.out.println("x + y < z: " + expression5); 
		}
}