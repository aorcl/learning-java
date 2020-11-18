import java.util.Scanner;
class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.next();
        double a, b, c, r = 0;

        switch (shape) {
            case "triangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                double p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                r = sc.nextDouble();
                System.out.println(3.14 * r * r);
                break;
        }
        sc.close();
    }
}