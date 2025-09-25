import java.util.Scanner;

public class MapleandMultiplication {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            for (int i = 0; i < t; i++) {
                int a,b,max,min,count =0;
                a = scanner.nextInt();
                b = scanner.nextInt();

                if (a==b ){
                    System.out.println(0);
                }else {
                    max = Math.max(a,b);
                    min = Math.min(a,b);

                    if (max % min != 0){
                        count = 2;
                    }else {
                        count = 1;
                    }
                    System.out.println(count);

                }

            }
        }
    }

