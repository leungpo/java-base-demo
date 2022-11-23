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
    public void should_return_sum_of_value(){
        BaseDemo baseDemo = new BaseDemo();
        int firstNumber = 10;
        int secondNumber = 12;
        assertEquals(firstNumber + secondNumber,baseDemo.sum(firstNumber,secondNumber));
    }
}
