import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IQtest{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Total number of elements
        int[] numbers = new int[n];

        // Reading the numbers
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }


        List<Integer> evenIndices = new ArrayList<>();
        List<Integer> oddIndices = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                evenIndices.add(i + 1);
            } else {
                oddIndices.add(i + 1);
            }
        }


        if (oddIndices.size() == 1) {
            System.out.println(oddIndices.get(0));
        } else {
            System.out.println(evenIndices.get(0));
        }

        scanner.close();
    }
}



// A. IQ test
// time limit per test2 seconds
// memory limit per test256 megabytes
// Bob is preparing to pass IQ test. The most frequent task in this test is to find out which one of the given n numbers differs from the others. Bob observed that one number usually differs from the others in evenness. Help Bob — to check his answers, he needs a program that among the given n numbers finds one that is different in evenness.

// Input
// The first line contains integer n (3 ≤ n ≤ 100) — amount of numbers in the task. The second line contains n space-separated natural numbers, not exceeding 100. It is guaranteed, that exactly one of these numbers differs from the others in evenness.

// Output
// Output index of number that differs from the others in evenness. Numbers are numbered from 1 in the input order.