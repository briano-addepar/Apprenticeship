package core;

import org.junit.Assert;
import org.junit.Test;

public class StringCutterTest {
    @Test
    public void testCut() {
        String input = "iamyourlyftdriver";
        String result = StringCutter.cut(input);
        Assert.assertEquals("muydv", result);
    }
    @Test
    public void testCutTwo() {
        String input = "jangodoggoischonk";
        String result = StringCutter.cut(input);
        Assert.assertEquals("ndgso", result);
    }
    @Test
    public void testCutThree() {
        String input = "meeko pupper";
        String result = StringCutter.cut(input);
        Assert.assertEquals("e pr", result);
    }
    @Test
    public void testCutFour() {
        String input = "";
        String result = StringCutter.cut(input);
        Assert.assertEquals("", result);
    }

}