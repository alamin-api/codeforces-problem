import java.util.Scanner;

public class DislikeofThrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int k = scanner.nextInt();
            int count = 0;
            int num = 0;

            while (count < k) {
                num++;

                if (num % 3 == 0 || num % 10 == 3) {
                    continue;
                }
                count++;

            }
            System.out.println(num);

        }
    }
}


//A. Dislike of Threes
//time limit per test1 second
//memory limit per test256 megabytes
//Polycarp doesn't like integers that are divisible by 3
//or end with the digit 3
//in their decimal representation. Integers that meet both conditions are disliked by Polycarp, too.
//
//Polycarp starts to write out the positive (greater than 0
//) integers which he likes: 1,2,4,5,7,8,10,11,14,16,…
//        . Output the k
//-th element of this sequence (the elements are numbered from 1
//).
//
//Input
//The first line contains one integer t
//        (1≤t≤100
//        ) — the number of test cases. Then t
//test cases follow.
//
//Each test case consists of one line containing one integer k
//        (1≤k≤1000
//        ).
//
//Output
//For each test case, output in a separate line one integer x
// — the k
//-th element of the sequence that was written out by Polycarp.
