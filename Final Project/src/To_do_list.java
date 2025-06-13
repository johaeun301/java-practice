import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void toggleDone() {
        isDone = !isDone;
    }

    @Override
    public String toString() {
        return (isDone ? "[완료] " : "[미완료] ") + description;
    }
}

public class To_do_list {
    private static final ArrayList<Task> tasks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("=== 투두리스트 프로그램 ===");

        while (running) {
            printMenu();
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    addTask();
                    break;
                case "2":
                    listTask();
                    break;
                case "3":
                    deleteTask();
                    break;
                case "4":
                    clearTask();
                    break;
                case "5":
                    running = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n메뉴를 선택하세요:");
        System.out.println("1. 할 일 추가");
        System.out.println("2. 할 일 목록 보기");
        System.out.println("3. 할 일 삭제");
        System.out.println("4. 완료 여부 설정");
        System.out.println("5. 종료");
        System.out.print("선택: ");
    }

    private static void addTask() {
        System.out.print("할 일을 입력하세요: ");
        String description = scanner.nextLine();
        tasks.add(new Task(description));
        System.out.println("할 일이 추가되었습니다.");
    }

    private static void listTask() {
        if (tasks.isEmpty()) {
            System.out.println("할 일이 없습니다.");
        } else {
            System.out.println("\n=== 할 일 목록 ===");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void deleteTask() {
        listTask();
        System.out.print("삭제할 할 일 번호를 입력하세요: ");
        try {
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
                System.out.println("할 일이 삭제되었습니다.");
            } else {
                System.out.println("잘못된 번호입니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요.");
        }
    }

    private static void clearTask() {
        listTask();
        System.out.print("완료 상태를 변경할 할 일의 번호를 입력하세요: ");
        try {
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index >= 0 && index < tasks.size()) {
                tasks.get(index).toggleDone();
                System.out.println("완료 상태가 변경되었습니다.");
            } else {
                System.out.println("잘못된 번호입니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요.");
        }
    }
}
