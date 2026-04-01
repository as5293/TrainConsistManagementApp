import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistManagementApp  {

    // Bogie model
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("===============================================\n");

        // Create large dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Type" + i, (i % 100) + 20));
        }

        // -------- LOOP APPROACH --------
        long startLoop = System.nanoTime();

        List<Bogie> filteredLoop = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                filteredLoop.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------- STREAM APPROACH --------
        long startStream = System.nanoTime();

        List<Bogie> filteredStream = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------- OUTPUT --------
        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}