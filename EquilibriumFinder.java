package POTD.GFG;
import java.util.Scanner;
public class EquilibriumFinder {
    public static int findEquilibrium(int arr[]) {
        int totalSum = 0; // Step 1: Calculate the total sum of the array.

        // Calculate the total sum of the array.
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int ssum = 0; // Initialize the sum of elements on the left.

        // Traverse the array and check for the equilibrium point.
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Now totalSum is the right sum for index i.

            // Check if left sum equals right sum
            if (ssum == totalSum) {
                return i; // If they are equal, return the index as the equilibrium point.
            }

            ssum += arr[i]; // Update left sum for the next iteration.
        }

        return -1; // Return -1 if no equilibrium point is found.
    }

    public static void main(String[] args) {
        // Read input array from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the equilibrium point
        int equilibriumIndex = findEquilibrium(arr);

        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium point is at index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium point found.");
        }

        sc.close();
    }
}
