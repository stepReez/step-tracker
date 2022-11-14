public class Converter {
    double distance;
    double calories;
    double calorieRatio = 50;
    double stepLength = 0.75;

    public Converter(int steps) {
        distance = steps * stepLength;
        calories = (steps * calorieRatio) / 1000;
    }
}
