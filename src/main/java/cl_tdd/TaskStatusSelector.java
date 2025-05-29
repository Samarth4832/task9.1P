package cl_tdd;

public class TaskStatusSelector {
    public static String getStatusByChoice(int choice) {
        switch (choice) {
            case 1:
                return "Working On It";
            case 2:
                return "Need Help";
            case 3:
                return "Ready for Feedback";
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Select your task status:");
        System.out.println("1. Working On It");
        System.out.println("2. Need Help");
        System.out.println("3. Ready for Feedback");

        int choice = scanner.nextInt();
        try {
            String status = getStatusByChoice(choice);
            System.out.println("You selected: " + status);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
