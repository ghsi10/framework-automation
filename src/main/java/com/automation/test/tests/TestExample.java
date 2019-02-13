package com.automaion.test.tests;

import com.automaion.test.core.Test;
import com.automaion.test.core.TesterInfo;
import com.automaion.test.core.TesterInfo.Priority;

@TesterInfo(
        priority = Priority.HIGH,
        createdBy = "mkyong.com",
        tags = {"sales", "test"}
)
public class TestExample {

    @Test
    public void testA() {
        if (true)
            throw new RuntimeException("This test always failed");
    }

    @Test(enabled = false)
    public void testB() {
        if (false)
            throw new RuntimeException("This test always passed");
    }

    @Test(enabled = true)
    public void testC() {
        if (10 > 1) {
            // do nothing, this test always passed.
        }
    }

}
