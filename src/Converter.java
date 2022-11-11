public class Converter {
    double distance;
    double calories;

    public Converter(int steps) {
        distance = steps * 0.75;
        calories = (steps * 50) / 1000;
    }
}
