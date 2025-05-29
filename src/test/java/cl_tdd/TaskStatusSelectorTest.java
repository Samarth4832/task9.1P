package cl_tdd;

import org.junit.Assert;
import org.junit.Test;

public class TaskStatusSelectorTest {

    @Test
    public void testChoice1ReturnsWorkingOnIt() {
        String result = TaskStatusSelector.getStatusByChoice(1);
        Assert.assertEquals("Working On It", result);
    }

    @Test
    public void testChoice2ReturnsNeedHelp() {
        String result = TaskStatusSelector.getStatusByChoice(2);
        Assert.assertEquals("Need Help", result);
    }

    @Test
    public void testChoice3ReturnsReadyForFeedback() {
        String result = TaskStatusSelector.getStatusByChoice(3);
        Assert.assertEquals("Ready for Feedback", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidChoiceThrowsException() {
        TaskStatusSelector.getStatusByChoice(5); // Invalid choice
    }
}
