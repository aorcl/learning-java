import java.util.Scanner;
class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type start");
        int start = sc.nextInt();
        System.out.println("type end");
        int end = sc.nextInt();
        sc.close();
        
        long product = 1;
        
        for (int i = start; i < end; i++) {
            product = product * i;
        }
        System.out.println(product);
    }
}