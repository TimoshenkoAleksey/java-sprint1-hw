public class StepTracker {
    private int purposOfSteps = 10000;
    MonthData[] monthToData;


    public void setPurposOfSteps(int purposOfSteps) {
        if (purposOfSteps >= 0)
            this.purposOfSteps = purposOfSteps;

    }


    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public  void printAllstatistics(int mouthNumber) {
        int stepsPerMonth = 0;
        int maximumSteps = 0;
        int Series = 0;
        int maxSeries = 0;


        for (int i = 0; i < monthToData[mouthNumber].days.length; i++) {
            System.out.print(String.format(" %s  день: %s, ", i + 1, monthToData[mouthNumber].days[i]));
            stepsPerMonth += monthToData[mouthNumber].days[i];
            if (monthToData[mouthNumber].days[i] > maximumSteps)
                maximumSteps = monthToData[mouthNumber].days[i];
            if (monthToData[mouthNumber].days[i] >= purposOfSteps) {
                Series++;
                if (maxSeries < Series)
                    maxSeries = Series;
            } else
                Series = 0;


        }
        System.out.println();
        System.out.println(String.format("Среднее количество шагов за месяц составило %s шагов", (stepsPerMonth / monthToData[mouthNumber].days.length)));
        System.out.println(String.format("За месяц было пройдено %s километров", Converter.reportDistanceTraveled(stepsPerMonth)));
        System.out.println(String.format("За месяц было сожжено %s килокалорий", Converter.NumberOfKilocalories(stepsPerMonth)));
        System.out.println(String.format("Лучшая серия составила %s дня", maxSeries));
        System.out.println();



    }

    class MonthData {

        int[] days = new int[30];

        public void setDays(int dayNumber, int numberOfSteps) {
            days[dayNumber - 1] = numberOfSteps;
        }
    }
}
