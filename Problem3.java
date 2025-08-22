import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int terms;
        if (a % 2 == 0) {
            terms = a - 1;
        } else {
            terms = a;
        }
        for (int i = 1; i <= terms; i++) {
            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber);

            if (i < terms) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
