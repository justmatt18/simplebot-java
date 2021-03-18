import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        char op = scanner.next().charAt(0);
        long num2 = scanner.nextLong();
        switch (op) {
            case '+':
                long sum = num1 + num2;
                System.out.println(sum);
                break;
            case '-':
                long diff = num1 - num2;
                System.out.println(diff);
                break;
            case '*':
                long prod = num1 * num2;
                System.out.println(prod);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                long quot = num1 / num2;
                System.out.println(quot);
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}