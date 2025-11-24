import java.util.*;
public class Activity4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to choose a menu");
        System.out.println("1 : Input and Display the Array");
        System.out.println("2 : Search an Element in the Array");
        System.out.println("3 : Largest and Smallest Element");
        System.out.println("4 : Copy Data to Another Array");

        int a = sc.nextInt();

        switch(a) {

            case 1: {
                int[] array = input();
                display(array);
                break;
            }

            case 2: {
                int[] array = input();
                System.out.println("Enter number to search:");
                int key = sc.nextInt();
                search(array, key);
                break;
            }

            case 3: {
                int[] array = input();
                largest(array);
                smallest(array);
                break;
            }

            case 4: {
                int[] array = input();
                int[] copied = new int[10];
                copydata(array, copied);
                break;
            }

            default:
                System.out.println("Invalid number.");
        }

        sc.close();
    }

    // Input array
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    // Display array
    public static void display(int[] A) {
        for(int j = 0; j < 10; j++) {
            System.out.println("A[" + j + "] = " + A[j]);
        }
    }

    // Search value
    public static void search(int[] array, int x) {
        for(int j = 0; j < 10; j++) {
            if(array[j] == x) {
                System.out.println("Element found at A[" + j + "] = " + x);
                return;
            }
        }
        System.out.println("Element not found.");
    }

    // Largest value
    public static void largest(int[] array) {
        int max = array[0];
        for(int i = 0; i < 10; i++) {
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("Largest value: " + max);
    }

    // Smallest value
    public static void smallest(int[] array) {
        int min = array[0];
        for(int i = 0; i < 10; i++) {
            if(array[i] < min)
                min = array[i];
        }
        System.out.println("Smallest value: " + min);
    }

    // Copy values
    public static void copydata(int[] array, int[] copied) {
        for(int j = 0; j < 10; j++) {
            copied[j] = array[j];
        }

        System.out.println("Copied array:");
        for(int j = 0; j < 10; j++) {
            System.out.println("B[" + j + "] = " + copied[j]);
        }
    }
}