package Chapter_8.TrafficLight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Traffic Light Durations:");

        // Loop through all enum constants
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s: %d seconds%n", light, light.getDuration());
        }
    }
}
