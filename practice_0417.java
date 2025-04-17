import java.util.Scanner;

public class practice_0417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. 음료 선택
        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int drinkChoice = scanner.nextInt();
        int basePrice = 0;

        if (drinkChoice == 1) {
            basePrice = 3000;
        } else if (drinkChoice == 2) {
            basePrice = 4000;
        } else if (drinkChoice == 3) {
            basePrice = 4500;
        } else {
            System.out.println("지원하지 않는 음료 입니다.");
            return;
        }

        //2. 크기 선택
        System.out.println("크기를 선택하세요: 1-Small, 2-Medium, 3-Large");
        int sizeChoice = scanner.nextInt();
        int sizeExtra = 0;

        if (sizeChoice == 1) {
            sizeExtra = 0;
        } else if (sizeChoice == 2) {
            sizeExtra = 500;
        } else if (sizeChoice == 3) {
            sizeExtra = 1000;
        } else {
            System.out.println("지원하지 않는 사이즈 입니다.");
            return;
        }

        //3. 추가 옵션 선택
        System.out.println("옵션을 선택하세요: 1-기본, 2-샷추가, 3-시럽추가, 4-샷+시럽추가");
        int optionChoice = scanner.nextInt();
        int optionExtra = 0;

        if (sizeChoice == 1) {
            optionExtra = 0;
        } else if (optionChoice == 2) {
            optionExtra = 500;
        } else if (optionChoice == 3) {
            optionExtra = 300;
        } else if (optionChoice == 4) {
            optionExtra = 800;
        } else {
            System.out.println("지원하지 않는 옵션 입니다.");
            return;
        }


        int totalPrice = (basePrice + sizeExtra + optionExtra);
        System.out.println("최종 가격은 " + totalPrice + "원 입니다.");

        scanner.close();
    }
}
