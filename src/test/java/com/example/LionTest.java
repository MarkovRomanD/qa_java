package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTest {

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(new Feline(), "Самец");
        var expected = List.of("Животные", "Птицы", "Рыба");
        var actual = lion.getFood();
        Assert.assertEquals("Не тот список еды",
                expected,
                actual);
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(new Feline(), "Самка");
        int expected = 1;
        var actual = lion.getKittens();
        Assert.assertEquals("Не то значение кол-ва львят",
                expected,
                actual);
    }
}