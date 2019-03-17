package school.cesar.unit.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static school.cesar.unit.examples.BmiCalculator.*;

public class BmiCalculatorTest {

    private static BmiCalculator calculator;

    @BeforeAll
    public static void setUp(){
        calculator = new BmiCalculator();
    }

    @Test
    public void normalBmi(){
        Assertions.assertEquals(NORMAL, calculator.calc(1, 24));
    }

    @Test
    public void overweightBmi(){
        Assertions.assertEquals(OVERWEIGHT, calculator.calc(1, 25));
    }

    @Test
    public void underweightBmi(){
        Assertions.assertEquals(UNDERWEIGHT, calculator.calc(1, 17));
    }

    @Test
    public void moderatelyObeseBmi(){
        Assertions.assertEquals(MODERATELY_OBESE, calculator.calc(1, 30));
    }

    @Test
    public void severelyObeseBmi(){
        Assertions.assertEquals(SEVERELY_OBESE, calculator.calc(1, 40));
    }

    @Test
    public void severelyUnderweightBmi(){
        Assertions.assertEquals(SEVERELY_UNDERWEIGHT, calculator.calc(1, 16.9));
    }
}
