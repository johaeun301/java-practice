import java.util.Scanner;

public class practice_0421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num >= 1 && num <= 100) {
            System.out.println("1에서 100 사이의 값입니다.");
        }
        if (num <= 1 || num >= 100) {
            System.out.println("1에서 100 사이의 값이 아닙니다");
        }

        scanner.close();
    }
}
