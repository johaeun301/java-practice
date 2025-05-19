import java.util.Scanner;

public class practice_0519_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("점수를 입력하세요 (종료하려면 음수를 입력): ");
            int score = scanner.nextInt();

            if (score < 0) {
                break;
            }

            sum += score;
        }

        if (sum > 0) {
            System.out.println("점수의 총합은: " + sum);
        } else {
            System.out.println("입력된 점수가 없습니다.");
        }

        scanner.close();
    }
}
