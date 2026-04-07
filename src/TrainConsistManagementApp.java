public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC17 - Sort Bogie Names using Arrays.sort()");
        System.out.println("======================================\n");

        // Create array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Display original array
        System.out.println("Original Bogie Names:");
        for (String name : bogieNames) {
            System.out.print(name + " ");
        }

        // Sorting using Arrays.sort()
        java.util.Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("\n\nSorted Bogie Names (Alphabetical):");
        for (String name : bogieNames) {
            System.out.print(name + " ");
        }

        System.out.println("\n\nUC17 sorting completed...");
    }
}