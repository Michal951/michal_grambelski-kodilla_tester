package exercises;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CaclAppTest {

        Caclculator caclculator = new Caclculator();

    @Test
    public void shoudReturnCorrectSum() {
        int a = 59;
        int b = 31;
        int sumResult = caclculator.sum(a, b);
    }

    @Test
    public void shouldReturnCorrectSubtract() {
        int a = 100;
        int b = 48;
        int subtractResult = caclculator.subtract(a, b);
        assertEquals(52,subtractResult);
    }

    @Test
    public void shouldReturnCorrectDivide() {
        int a = 100;
        int b = 25;
        int divResult = caclculator.divide(a, b);
    }

    @Test
    public void shouldReturnCorrectMultiply() {
        int a = 5;
        int b = 25;
        int mulResult = caclculator.multiply(a, b);
    }
}