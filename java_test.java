//java test
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @test
    public void totalSum() {
         Calculator calculator = new Calculator();
        int expected = 5;

        // Act
        int result = calculator.sum(3, 2);

        // Assert
        assertEquals(expected, result);

    }
}