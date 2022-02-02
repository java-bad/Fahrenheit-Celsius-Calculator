import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        // user input type of temperature

        System.out.println("Celsius to Fahrenheit and vice versa. Celsius or Fahrenheit?: ");
        String first = Keyboard.nextLine();
        // user input temperature

        System.out.println("Temperature: ");
        double firstValue = Keyboard.nextDouble();
        Algorithm out = new Algorithm();
        System.out.println("here:" + out.Output(firstValue, first));
    }
}