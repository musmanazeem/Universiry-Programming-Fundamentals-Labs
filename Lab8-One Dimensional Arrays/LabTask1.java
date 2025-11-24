import java.util.Scanner;
public class LabTask1 {

    public static void summarize(int[] ratings) {
        double total = 0;
        int[] counts = new int[10];
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] >= 1 && ratings[i] <= 10) {
                counts[ratings[i] - 1]++;
                total += ratings[i];
            } else {
                System.out.println("Warning: Invalid rating " + ratings[i] + " ignored.");
            }
        }
        System.out.println("\nRating Summary:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println((i + 1) + ": " + counts[i] + " responses");
        }

        double average = total / ratings.length;
        System.out.printf("Overall Rating = %.2f/10\n", average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================\n| FOOD QUALITY POLL |\n===================");
        int students = 10;
        int[] ratings = new int[students * 4];
        int index = 0;

        for (int student = 1; student <= students; student++) {
            System.out.println("\nRatings of Student #" + student);
            System.out.print("Rate the Pizza (1-10): ");
            ratings[index++] = sc.nextInt();
            System.out.print("Rate the Burger (1-10): ");
            ratings[index++] = sc.nextInt();
            System.out.print("Rate the Cuisine (1-10): ");
            ratings[index++] = sc.nextInt();
            System.out.print("Rate the Drinks (1-10): ");
            ratings[index++] = sc.nextInt();
        }
        System.out.println("\n=======================\n| FOOD QUALITY POLL RESULTS |\n=======================");
        summarize(ratings);
        sc.close();
    }
}
