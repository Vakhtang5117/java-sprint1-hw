import java.util.Scanner;

public class StepTracker {
    Converter converter = new Converter();
    int goalByStepsPerDay = 10000;
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        int month;
        int day;
        int step;
        System.out.println("Введите номер месяца");
        month = scanner.nextInt();
        if (month < 1 && month > 12) {
            System.out.println("Ошибка");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        day = scanner.nextInt();
        if (day < 1 && day > 30) {
            System.out.println("Ошибка");
            return;
        }
        System.out.println("Введите количество шагов");
        step = scanner.nextInt();
        if (step < 0) {
            System.out.println("Ошибка");
            return;
        }
        // monthToData[month-1].days[day-1] = step;
        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] = step;

    }

    void changeStepGoal() {
        int input = scanner.nextInt();
        if (input <= 0) {
            System.out.println("Ошибка");
            return;
        }
        goalByStepsPerDay = input;
    }

     void printStatistic() {
        System.out.println("Введите число месяца");

        int month = scanner.nextInt();
        if (month < 1 && month > 12) {
            System.out.println("Ошибка");
            return;
        }
        monthToData[month - 1].printDaysAndStepsFromMonth();
        int sumSteps = monthToData[month - 1].sumStepsFromMonth();
        System.out.println(sumSteps);
        System.out.println(monthToData[month - 1].maxSteps());
        System.out.println(sumSteps / 30);
        System.out.println(converter.convertToKm(sumSteps));
        System.out.println(converter.convertStepsToKilocalories(sumSteps));
        System.out.println(monthToData[month -1].bestSeries(goalByStepsPerDay));
        System.out.println();

    }
}
