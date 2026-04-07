public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("======================================\n");


        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309";

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }

        System.out.println("\nUC18 search completed...");
    }
}