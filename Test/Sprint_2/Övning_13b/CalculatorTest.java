package Sprint_2.Övning_13b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void kontrolleraOperatorTest() {
        String error = "%";
        Throwable exception = assertThrows(OperatorNotSupportedException.class, () -> Calculator.kontrolleraOperator(error));
    }
}