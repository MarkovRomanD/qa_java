package com.example.ParamTests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamTest {
    private final String sex;
    private final boolean expected;

    public LionParamTest(
            String sex,
            boolean expected
    ) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeParameterizedTest() throws Exception {
        Lion lion = new Lion(new Feline(), sex);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals("Некорректно заполнился пол льва",
                expected,
                actual);

    }
}
