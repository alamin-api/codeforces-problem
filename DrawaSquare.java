import java.util.Scanner;

public class DrawaSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        float a, b, c, d;
        for (int i = 0; i < t; i++) {
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            d = scanner.nextFloat();

            if (a == b && b == c && c == d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}

/*
Please determine if it is possible to draw a square∗
 with the given points as its vertices.

∗
A square is defined as a polygon consisting of 4
 vertices, of which all sides have equal length and all inner angles are equal. No two edges of the polygon may intersect each other.

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤104
). The description of the test cases follows.

The first line of each test case contains four integers l
, r
, d
, u
 (1≤l,r,d,u≤10
).

Output
For each test case, if you can draw a square using the four points, output "Yes". Otherwise, output "No".

You can output the answer in any case. For example, the strings "yEs", "yes", and "YES" will also be recognized as positive responses.
 */