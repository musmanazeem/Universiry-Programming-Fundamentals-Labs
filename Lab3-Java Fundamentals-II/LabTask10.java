public class LabTask10{
public static void main(String [] args){

	System.out.printf("Degree\t"+"Radian\t"+"Sine\t"+"Cosine\t"+"Tagent\n");
	int degree = 30;

	double radian = Math.toRadians(degree);

	double sin = Math.sin(radian);
	double cos = Math.cos(radian);
	double tan = Math.tan(radian);

	System.out.print(degree);

	System.out.printf("\t%1.4f\t",radian);
	System.out.printf("%1.4f\t",sin);
	System.out.printf("%1.4f\t",cos);
	System.out.printf("%1.4f\t",tan);
	System.out.printf("\n");

	degree = 60;
	radian = Math.toRadians(degree);

	sin = Math.sin(radian);
	cos = Math.cos(radian);
	tan = Math.tan(radian);

	System.out.print(degree);
	System.out.printf("\t%1.4f\t",radian);
	System.out.printf("%1.4f\t", sin);
	System.out.printf("%1.4f\t", cos);
	System.out.printf("%1.4f\t", tan);
	}
}