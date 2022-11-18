public class Converter {

    public static double converToDistanceKm(int stepsPerMonth) {
        return stepsPerMonth * 0.75 / 1000;
    }

    public static int convertToCalories(int stepsPerMonth) {
        return stepsPerMonth * 50 / 1000;
    }
}
