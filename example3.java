import java.util.Scanner;
class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int maxValue = 0;
        int currentValue = -1;

        while (currentValue != 0) {
            currentValue = scanner.nextInt();
            
            maxValue = currentValue > maxValue ? currentValue : maxValue; 
        }

        System.out.println(maxValue);
        
        scanner.close();
    }
}