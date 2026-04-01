import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // ===== Bogie Class =====
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // ===== Goods Bogie Class =====
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ================= UC12 =================
        System.out.println("==============================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("==============================================\n");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        for (GoodsBogie g : goodsBogies) {
            System.out.println(g.type + " -> " + g.cargo);
        }

        boolean isSafe = goodsBogies.stream().allMatch(g ->
                !g.type.equalsIgnoreCase("Cylindrical") ||
                g.cargo.equalsIgnoreCase("Petroleum")
        );

        System.out.println("\nSafety Compliance Status: " + isSafe);
        System.out.println(isSafe ? "Train formation is SAFE." : "Train formation is NOT SAFE.");

        // ================= UC13 =================
        System.out.println("\n===============================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("===============================================\n");

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Type" + i, (i % 100) + 20));
        }

        // LOOP
        long startLoop = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }
        long loopTime = System.nanoTime() - startLoop;

        // STREAM
        long startStream = System.nanoTime();
        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long streamTime = System.nanoTime() - startStream;

        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        System.out.println("\nExecution completed...");
    }
}