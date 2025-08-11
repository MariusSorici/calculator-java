import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculateSimpleAddition() {
        // 4+5 = 9
        String result = Calculator.Run("4+5");
        assertEquals("9.0", result);
    }

    @Test
    public void testCalculateWithPriority() {
        // 10+5*4+3 = 33
        String result = Calculator.Run("10+5*4+3");
        assertEquals("33.0", result);
    }

    @Test
    public void testDivisionOrderBug() {
        // conform regulii stânga→dreapta, 10/2*3 = 15
        // programul calculează înmulțirea înaintea împărțirii, rezultând 1.666...
        String result = Calculator.Run("10/2*3");
        // Aici arătăm comportamentul actual
        assertEquals("1.6666666", result.substring(0, 9));
    }

    @Test
    public void testDivisionByZeroReturnsInfinity() {
        // 10/0 întoarce Infinity (nu excepție), deoarece calculează cu float
        String result = Calculator.Run("10/0");
        assertEquals("Infinity", result);
    }
}
