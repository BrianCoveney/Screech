package servlets;

import main.java.servlets.ScreechServlet;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by brian on 24/02/17.
 */
public class ScreechServletTest {

    private ScreechServlet screechServlet;
    private double skidDistance = 60;
    private double dragFactor = 0.75;
    private double breakingEfficiency = 1.0;
    private double expectedResult = 36.7;
    private double unexpectedResult = 30.0;


    @Before
    public void setUp() throws Exception {
        screechServlet = new ScreechServlet();
    }

    @Test
    public void calculateSpeed() throws Exception {
        assertThat(expectedResult,is(screechServlet.calculateSpeed(skidDistance, dragFactor, breakingEfficiency)));
        assertThat(unexpectedResult, is(not(screechServlet.calculateSpeed(skidDistance, dragFactor, breakingEfficiency))));
    }

}