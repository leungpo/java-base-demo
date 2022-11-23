package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void given_2_positive_int_should_return_sum_of_value(){
        BaseDemo baseDemo = new BaseDemo();
        int firstNumber = 10;
        int secondNumber = 12;
        assertEquals(22,baseDemo.sum(firstNumber,secondNumber));
    }

    @Test
    public void given_2_negative_int_should_return_sum_of_negative_value(){
        BaseDemo baseDemo = new BaseDemo();
        int firstNumber = -10;
        int secondNumber = -12;
        assertEquals(-22,baseDemo.sum(firstNumber,secondNumber));
    }

}
