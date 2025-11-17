public class LabTask4{
	public static int numberOfDaysInAYear(int year){
    int days;
            if (year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0)){
                days = 366;
            }
            else{
                days = 365;
            }
        return days; 
	}
    public static void main(String [] args){
        for (int year = 2000; year <= 2020; year++ ){
            System.out.println("Year "+ year +" has "+ numberOfDaysInAYear(year) + " days.");
        }
	}
}