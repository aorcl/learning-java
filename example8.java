import java.util.Scanner;
class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int sum = 0;
        int currentValue = 0;

        while (true) {
            if (scanner.hasNext()) {
                currentValue = scanner.nextInt();
            } else {
                break;
            }
            
            if (currentValue == 0) {
                break;
            } else {
                sum += currentValue;
                if (sum >= 1000) {
                    sum -= 1000;
                    break;
                }
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}