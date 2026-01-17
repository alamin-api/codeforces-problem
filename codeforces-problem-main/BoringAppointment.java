import java.util.Scanner;

public class BoringAppointment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String x = sc.next();
            int totalPress = 0;

            boolean  found = false;
            for (int j = 1; j <= 9 && !found; j++) {
                String current = "";
                for (int k = 1; k <= 4 ; k++) {
                    current +=j;
                    totalPress += k;
                    if(current.equals(x)){
                        found = true;
                        break;
                    }
                }

            }

            System.out.println(totalPress);

        }
    }
}