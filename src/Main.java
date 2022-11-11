import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StepTracker stepTracker = new StepTracker();
        while (true) {

            printMenu();
            int userInput = scanner.nextInt();

            if (userInput == 1) {

                System.out.println("Выберите месяц");
                int month = scanner.nextInt();
                System.out.println("Выберите день");
                int day = scanner.nextInt();
                System.out.println("Введите колличесвто шагов");
                int steps = scanner.nextInt();

                stepTracker.stepInput(month, day, steps);

            } else if (userInput == 2) {

                System.out.println("Выберите месяц");
                int month = scanner.nextInt();
                stepTracker.stepStats(month);

            } else if (userInput == 3) {

                System.out.println("Введите новую цель");
                int target = scanner.nextInt();
                stepTracker.targetChange(target);

            } else if (userInput == 4) {
                break;
            } else {
                System.out.println("Выбрана несуществующая команда");
            }

        }
        System.out.println("Выход из приложения");
    }

    public static void printMenu() {
        System.out.println("Выберите команду");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("4. Выйти из приложения");
    }
}
