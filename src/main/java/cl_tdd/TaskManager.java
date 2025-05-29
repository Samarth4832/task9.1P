package cl_tdd;

public class TaskManager {
    public static String getTaskStatus(String taskId) {
        if (taskId == null) return "Invalid Task ID";
        switch (taskId) {
            case "TASK001": return "Not tarted";
            case "TASK002": return "In Progress";
            case "TASK003": return "Submitted";
            case "TASK004": return "Feedback Received";
            default: return "Invalid Task ID";
        }
    }
}
