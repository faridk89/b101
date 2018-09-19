import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int sum = calculator.sum(10,20);
        Assert.assertEquals(sum,30,"Sum did not matched");
    }
    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator();
        int mul = calculator.multiplication( 10,10);
        Assert.assertEquals(mul,100,"Multiplication Matched");
    }
}
