public class Converter {

    public static double reportDistanceTraveled(int stepsPerMonth) {
        return (int) (stepsPerMonth * 0.75 / 10) / 100.;
    }

    public static int NumberOfKilocalories(int stepsPerMonth) {
        return stepsPerMonth * 50 / 1000;
    }

}
