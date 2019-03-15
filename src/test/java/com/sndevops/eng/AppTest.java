package com.sndevops.eng;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {
 //Add tests
    private String INPUT = "12";
    private String INPUT1 = "1234567";
    private String INPUT2 = "117";
    private boolean isPassed = false;
    // Add more tests
    @Test
    public void testLength() {
        // Add few more details. More details to be added 
        Assert.assertEquals(INPUT,"12");
        Assert.assertEquals(INPUT2,"117");
    }
    
    @Test
    public void testPassed() {
        // Add test cases 
        // Add few lines
        Assert.assertEquals(isPassed,false);
        Assert.assertEquals(isPassed,false);
    }
}
