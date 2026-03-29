import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("======================================\n");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println(passengerBogies);

        System.out.println(passengerBogies.contains("Sleeper"));

        System.out.println(passengerBogies);
    }
}