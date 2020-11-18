import java.util.Scanner;
class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int sum = 0;
        int currentValue = -1;

        while (currentValue != 0) {
            currentValue = scanner.nextInt();
            
            sum = sum + currentValue; 
        }

        System.out.println(sum);
        
        scanner.close();
    }
}