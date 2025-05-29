package cl_tdd;

import org.junit.Assert;
import org.junit.Test;

public class TaskStatusSelectorTest {

	@Test
    public void testGetTaskStatus_NotStarted() {
        String status = TaskManager.getTaskStatus("TASK001");
        Assert.assertEquals("Not Started", status);
    }

    @Test
    public void testGetTaskStatus_InProgress() {
        String status = TaskManager.getTaskStatus("TASK002");
        Assert.assertEquals("In Progress", status);
    }

    @Test
    public void testGetTaskStatus_Submitted() {
        String status = TaskManager.getTaskStatus("TASK003");
        Assert.assertEquals("Submitted", status);
    }

    @Test
    public void testGetTaskStatus_FeedbackReceived() {
        String status = TaskManager.getTaskStatus("TASK004");
        Assert.assertEquals("Feedback Received", status);
    }

    @Test
    public void testGetTaskStatus_InvalidTaskId() {
        String status = TaskManager.getTaskStatus("INVALID123");
        Assert.assertEquals("Invalid Task ID", status);
    }

    @Test
    public void testGetTaskStatus_NullTaskId() {
        String status = TaskManager.getTaskStatus(null);
        Assert.assertEquals("Invalid Task ID", status);
    }
}
