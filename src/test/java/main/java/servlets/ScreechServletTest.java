package main.java.servlets;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by brian on 25/02/17.
 */
public class ScreechServletTest {

    private ScreechServlet screechServlet;
    private double skidDistance1 = 60.0;
    private double skidDistance2 = 30.0;
    private double dragFactor = 0.75;
    private double breakingEfficiency = 1.0;
    private double expectedResult = 36.7;
    private double unexpectedResult = 30.0;
    private int fourSkidMarks = 4;
    private int threeSkidMarks = 3;
    private int twoSkidMarks = 2;
    private int oneSkidMark = 1;


    @Before
    public void setUp() throws Exception {
        screechServlet = new ScreechServlet();
    }

    @Test
    public void calculateSpeed() throws Exception {
        assertThat(expectedResult,is(screechServlet.calculateSpeed(skidDistance1, dragFactor, breakingEfficiency)));
        assertThat(unexpectedResult, is(not(screechServlet.calculateSpeed(skidDistance1, dragFactor, breakingEfficiency))));
    }

    @Test
    public void calculateAverageSkidDistance() throws Exception {
        assertThat(60.0, is(screechServlet.calculateAverageSkidDistance(fourSkidMarks, skidDistance1, skidDistance1, skidDistance1, skidDistance1)));
        assertThat(50.0, is(screechServlet.calculateAverageSkidDistance(threeSkidMarks, skidDistance1, skidDistance2, skidDistance1, 0)));
        assertThat(45.0, is(screechServlet.calculateAverageSkidDistance(twoSkidMarks, skidDistance1, skidDistance2, 0, 0)));
        assertThat(30.0, is(screechServlet.calculateAverageSkidDistance(oneSkidMark, skidDistance2, 0, 0, 0)));
    }


}