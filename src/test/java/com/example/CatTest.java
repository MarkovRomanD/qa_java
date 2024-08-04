package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getFoodMockedMeatListTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Мясо", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        var actual = cat.getFood();
        Assert.assertEquals("Не тот список еды",
                actual,
                expected);
    }

    @Test
    public void getSoundDefaultTest() {
        Cat cat = new Cat(new Feline());
        String actual = cat.getSound();
        Assert.assertEquals("Не тот звук у кота",
                "Мяу",
                actual);
    }
}