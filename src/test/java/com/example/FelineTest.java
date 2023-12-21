package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expected = feline.getFood("Хищник");
        Assert.assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());

    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(3, feline.getKittens(3));

    }
}