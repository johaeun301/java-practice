import java.util.Scanner;

public class practice_0512_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("숫자를 입력하세요.: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("홀수의 합: " + sum);
    }
}
