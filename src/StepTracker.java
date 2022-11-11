public class StepTracker {

    int targetSteps = 10000;
    MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        int[] dayToData = new int[30];
    }

    void stepInput (int month, int day, int steps) {
        if (month < 0 || month > 11 || day < 1 || day > 30) {
            System.out.println("Введена некоректная дата");
        } else if (steps < 0) {
            System.out.println("Количесво шагов не может быть отрицательным");
        } else {
            monthToData[month].dayToData[day - 1] = steps;
        }
    }

    void stepStats (int month) {
        int stepSum = 0;
        int max = monthToData[month].dayToData[0];
        int streak = 0;
        int streakCount = 0;
        double distance = 0;
        double calories = 0;

        for (int i = 0; i < monthToData[month].dayToData.length; i++){

            Converter converter = new Converter(monthToData[month].dayToData[i]);

            distance = distance + converter.distance;
            calories = calories + converter.calories;
            stepSum = stepSum + monthToData[month].dayToData[i];

            if (max < monthToData[month].dayToData[i]) {
                max = monthToData[month].dayToData[i];
            }

            if (monthToData[month].dayToData[i] >= targetSteps) {
                streakCount ++;
                if (streakCount > streak) {
                    streak = streakCount;
                }
            } else {
                streakCount = 0;
            }

            System.out.print((i + 1) + " день: " + monthToData[month].dayToData[i] + ", ");

        }

        System.out.println();
        System.out.println("Максиальное кол-во шагов за месяц:" + max);
        System.out.println("Всего шагов за месяц: " + stepSum);
        System.out.println("Среднее кол-во шагов в день " + stepSum / monthToData[month].dayToData.length);
        System.out.println("Пройденная дистанция: " + distance);
        System.out.println("Каллорий сожжено: " + calories);
        System.out.println("Лучшая серия: " + streak + " дней подряд");
    }

    void targetChange(int target) {

        targetSteps = target;
    }
}
