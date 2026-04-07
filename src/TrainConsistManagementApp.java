public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC20 - Exception Handling in Search");
        System.out.println("======================================\n");


        String[] bogieIds = {};

        String searchKey = "BG101";


        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available. Cannot perform search.");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }

        System.out.println("\nUC20 execution completed...");
    }
}