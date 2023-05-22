import java.util.List;
import java.util.ArrayList;

public class TestCalculator {
    public static void main(String[] args) {
        test_calculate();
    }

    public static void test_calculate() {
        String Expression = "4+5";
        String expected_result = "9.0";
        Calculator actual_result = new Calculator();

        Calculator.Run(Expression);
        
        String textResult = Float.toString(actual_result.finalResult);


        if (expected_result.equals(textResult)) {
            System.out.println ("result is correct");
        
        } else {
            System.out.println ("result is not correct");
        }
    }
}
