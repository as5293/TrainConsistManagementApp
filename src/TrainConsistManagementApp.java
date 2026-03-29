import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<String> trainConsist = new ArrayList<>();

        TrainUtils.displayHeader();
        TrainUtils.displaySummary(trainConsist);
    }
}