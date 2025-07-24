import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        boolean found = binarySearch(arr, key);

        if (found) {
            System.out.println("Key " + key + " found in the array.");
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }

    public static boolean binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
