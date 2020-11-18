import java.util.Scanner;
class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long currentValue = scanner.nextLong();
        scanner.close();
        int n = 0;
        long fact = 1;

        do {
            n++;
            fact = fact * n;
        } while (fact <= currentValue);

        System.out.println(n);
    }
}