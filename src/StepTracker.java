public class StepTracker {
    private int purposeSteps = 10000;
    MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void setPurposeSteps(int purposeSteps) {
        if (purposeSteps >= 0)
            this.purposeSteps = purposeSteps;
    }

    public void printAllStatistics(int mounthNumber) {
        int stepsPerMonth = 0;
        int maximumSteps = 0;
        int series = 0;
        int maxSeries = 0;

        for (int i = 0; i < monthToData[mounthNumber].days.length; i++) {
            System.out.print(String.format(" %s  день: %s, ", i + 1, monthToData[mounthNumber].days[i]));
            stepsPerMonth += monthToData[mounthNumber].days[i];
            if (monthToData[mounthNumber].days[i] > maximumSteps)
                maximumSteps = monthToData[mounthNumber].days[i];
            if (monthToData[mounthNumber].days[i] >= purposeSteps) {
                series++;
                if (maxSeries < series)
                    maxSeries = series;
            } else
                series = 0;
        }

        System.out.println();
        System.out.println(String.format("Среднее количество шагов за месяц составило %s шагов", (stepsPerMonth / monthToData[mounthNumber].days.length)));
        System.out.println(String.format("За месяц было пройдено %s километров", Converter.converToDistanceKm(stepsPerMonth)));
        System.out.println(String.format("За месяц было сожжено %s килокалорий", Converter.convertToCalories(stepsPerMonth)));
        System.out.println(String.format("Лучшая серия составила %s дня", maxSeries));
        System.out.println();
    }

    class MonthData {
        int[] days = new int[30];

        public void setDays(int dayNumber, int StepsNumber) {
            days[dayNumber - 1] = StepsNumber;
        }
    }
}
