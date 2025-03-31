import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter number1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        num2 = sc.nextInt();
        System.out.print("Enter number3: ");
        num3 = sc.nextInt();

        System.out.print(num1 + num2 + num3);
    }
}