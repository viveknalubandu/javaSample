package com.sndevops.eng;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    private String INPUT = "123456";
    @Test
    public void testLength() {
        // test
        Assert.assertEquals(INPUT,"123456");
    }
}
