public class Algorithm {
    public double result = 0.0;

    public double Output(double value, String dataType) {
        if (dataType == "Celsius") {
            result = value * 9 / 5 + 32;
        } else if (dataType == "celsius") {
            result = value * 9 / 5 + 32;
        } else if (dataType == "Fahrenheit") {
            result = value - 32 * .5556;
        } else if (dataType == "fahrenheit") {
            result = value - 32 * .5556;
        }
        return result;
    }
}
