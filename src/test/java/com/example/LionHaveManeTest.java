package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)

public class LionHaveManeTest {
    @Parameterized.Parameter(0)
    public String sex;

    @Parameterized.Parameter(1)
    public boolean hasMane;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},

        };
    }

    @Mock
    Feline feline;


    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(hasMane, actual);
    }

    @Test(expected = Exception.class)
    public void doesHaveManeException() throws Exception {
        Lion lion = new Lion("Тест", feline);
    }

}
