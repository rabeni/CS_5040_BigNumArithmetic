
import java.io.FileNotFoundException;
import student.TestCase;

/**
 * Test case for the BigNum main class
 * @author Robert Benish
 *
 */

public class BigNumArithmeticTest extends TestCase {
    
    public void testMain() throws FileNotFoundException {
        BigNumArithmetic.main(new String[] { "Input1.txt" });
        assertEquals("The file Input1.txt was found.\n", systemOut().getHistory());
    }
    
    
}
