package main.java.beans;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by brian on 24/02/17.
 */
public class ScreechBeanTest {

    private ScreechBean screechBean;

    @Before
    public void setUp() throws Exception {
        screechBean = new ScreechBean();
        screechBean.setSkidLength(50);
    }

    @Test
    public void isNotZero() throws Exception {
        assertThat(screechBean.isNotZero(), is(true));
    }



}