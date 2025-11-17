import java.util.*;
public class LabTask8 {
    public static int countVowels(String x){
        int j = 0;
        for (int i = 0; i <x.length(); i++){
        char ch = Character.toLowerCase(x.charAt(i));
        if (ch =='a'|| ch =='e'||ch =='i'||ch =='o'||ch =='u'){
            j++;
        }
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String x = sc.nextLine();
        System.out.println("Number of  Vowels in the string :"+countVowels(x));
        sc.close();   
    }
}