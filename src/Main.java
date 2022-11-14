import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StepTracker stepTracker = new StepTracker();
        while (true) {

            printMenu();
            int inputMenuItem = scanner.nextInt();

            switch (inputMenuItem) {
                case 1:
                    stepTracker.stepInput();
                    break;
                case 2 :
                    stepTracker.stepStats();
                    break;
                case 3:
                    stepTracker.targetChange();
                    break;
                case 4:
                    System.out.println("Выход из приложения");
                    break;
                default:
                    System.out.println("Выбрана несуществующая команда");
                    break;
            }

            if (inputMenuItem == 4) {
                break;
            }

        }
    }

    public static void printMenu() {
        System.out.println("Выберите команду");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("4. Выйти из приложения");
    }
}
