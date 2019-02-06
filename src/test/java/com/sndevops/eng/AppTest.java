package com.sndevops.eng;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    private String INPUT = "123456";
    private String INPUT1 = "1234567";
    private String INPUT2 = "12345678";
    
    @Test
    public void testLength() {
        // Add few more details. More details to be added 
        Assert.assertEquals(INPUT,"123456");
        Assert.assertEquals(INPUT1,"1234567");
        Assert.assertEquals(INPUT2,0)
    }
}
