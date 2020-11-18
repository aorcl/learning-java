import java.util.Scanner;
class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int currentValue = scanner.nextInt();
            if (currentValue == 0) { break; }
            System.out.println(currentValue % 2 == 0 ? "even" : "odd");
        }

        scanner.close();
    }
}