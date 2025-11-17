/*Write a program that prompts the user to enter the year and first day of the year and displays the calendar table for the year on the console. For example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, your program should display the calendar for each month in the year, as follows: */

import java.util.Scanner;
public class LabTask5{
  public static void main (String [] args){
	int month, daysInMonth, i, j;
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the year : ");
	int year = sc.nextInt();

	System.out.print("\nFirst day of the "+year+"\n(1) Monday\n(2) Tuesday\n(3) Wednesday\n(4) Thursday\n(5) Friday\n(6) Saturday\n(7) Sunday\n\n-->SELECT (1-7) : ");
	int firstDay = sc.nextInt();

for (month = 1; month <= 12; month++){
	if (month == 2 ){
		if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){daysInMonth = 29;}
		else{daysInMonth = 28;}
	}

	else if (month == 4 || month == 6 || month == 9 || month == 11){daysInMonth = 30;}

	else{
	daysInMonth = 31;
}


       switch (month) {
	case 1:System.out.println("\n\tJANUARY  "+year);
	break;
	case 2:System.out.println("\n\tFEBRUARY  "+year);
	break;
	case 3:System.out.println("\n\tMARCH  "+year);
	break;
	case 4:System.out.println("\n\tAPRIL  "+year);
	break;
	case 5:System.out.println("\n\tMAY  "+year);
	break;
	case 6:System.out.println("\n\tJUNE  "+year);
	break;
	case 7:System.out.println("\n\tJULY  "+year);
	break;
	case 8:System.out.println("\n\tAUGUST  "+year);
	break;
	case 9:System.out.println("\n\tSEPTEMBER  "+year);
	break;
	case 10:System.out.println("\n\tOCTOBER  "+year);
	break;
	case 11:System.out.println("\n\tNOVEMBER  "+year);
	break;
	case 12:System.out.println("\n\tDECEMBER  "+year);
	break;
	default:
	break;
}


System.out.println("---------------------------------");
System.out.println("  Mon Tue Wed Thu Fri Sat Sun");

	for(i = 1; i < firstDay; i++){System.out.print("    ");}

	for(j = 1; j <= daysInMonth; j++){System.out.printf("%4d", j);
		if ((firstDay + j - 1) % 7 == 0){System.out.println();}
	}

	firstDay = (firstDay + daysInMonth) % 7;
	if (firstDay == 0){firstDay = 7;}
	System.out.println();
	}
	sc.close();
	}
}