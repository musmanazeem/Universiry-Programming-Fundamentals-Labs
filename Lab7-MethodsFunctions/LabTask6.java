import java.util.Scanner;
public class LabTask6 {
    public static String capitalize(String x) {
        char firstChar = Character.toUpperCase(x.charAt(0));
        String result = "" + firstChar;
        for (int i = 1; i < x.length(); i++) {
            result += x.charAt(i);
        }   
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase word: ");
        String word = sc.nextLine();
        System.out.println("Capitalized Word: " + capitalize(word));
       
        System.out.print("Enter a line of lowercase words: ");
        String line = sc.nextLine();
        String capitalizedLine = "";
        word = "";
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                capitalizedLine += capitalize(word) + " ";
                word = "";
            }
        }
        if (word.length() > 0) {
            capitalizedLine += capitalize(word);
        }
        System.out.println("Capitalized line: " + capitalizedLine);
        sc.close();
    }
}
