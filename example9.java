import java.util.Scanner;
class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // defaults: ascending and ordered
        Boolean isAscending = true; 
        Boolean isOrdered = true;

        // need to detect if it starts as ascending or descending first
        int previousValue = scanner.nextInt();
        int currentValue = scanner.nextInt();

        // special case: only two values and the second one is zero: nothing to do, stop the program and return true
        if (currentValue == 0) {
            System.out.println(true);
            scanner.close();
            return;
        }

        if (currentValue >= previousValue) {
            // ascending or unchanged
            isAscending = true;
        } else {
            // descending
            isAscending = false;
        }
        
        // continue if more than 2 values
        while (true) {
            previousValue = currentValue;
            currentValue = scanner.nextInt();

            // end of sequence detected, break out of while loop
            if (currentValue == 0) {
                break;
            }
            
            // will try to detect if the order inverts on the current value
            if (isAscending) {
                // was ascending
                if (currentValue < previousValue) {
                    // inversion detected
                    isOrdered = false;
                    break;
                }
            } else {
                // was descending
                if (currentValue > previousValue) {
                    // inversion detected
                    isOrdered = false;
                    break;
                }
            }
        }

        System.out.println(isOrdered);
        
        scanner.close();
    }
}