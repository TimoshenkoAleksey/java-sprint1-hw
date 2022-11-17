import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        while (true) {
            printMenu();
            int menuNumber = scanner.nextInt();

            if (menuNumber == 1) {
                System.out.println("За какой месяц ввести количество шагов? ");
                int mounthNumber = scanner.nextInt();
                System.out.println("За какой день ввести количество шагов? ");
                int dayNumber = scanner.nextInt();
                System.out.println("Сколько шагов? ");
                int StepsNumber = scanner.nextInt();
                stepTracker.monthToData[mounthNumber].setDays(dayNumber, StepsNumber);

            } else if (menuNumber == 2) {
                System.out.println("За какой месяц напечатать статистику? ");
                int mouthNumber = scanner.nextInt();
                stepTracker.printAllStatistics(mouthNumber);

            } else if (menuNumber == 3) {
                System.out.println("Введите новую цель по количеству шагов в день.");
                int StepsPurpos = scanner.nextInt();
                stepTracker.setPurposeSteps(StepsPurpos);

            } else if (menuNumber == 4) {
                break;

            } else
                System.out.println("Такой команды нет.");
        }
    }

    public static void printMenu() {
        System.out.println("1. Ввести количество шагов за определённый день.");
        System.out.println("2. Напечатать статистику за определённый месяц.");
        System.out.println("3. Изменить цель по количеству шагов в день.");
        System.out.println("4. Выйти из приложения.");
    }
}
