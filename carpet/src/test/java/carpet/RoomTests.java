
 
import org.testng.annotations.*;
 
public class SimpleTest {
 
 @BeforeClass
 public void setUp() {
   // code that will be invoked when this test is instantiated
 }
 
 @Test
 public void aFastTest() {
   System.out.println("Fast test");
 }
 
 @Testx
 public void aSlowTest() {
    System.out.println("Slow test");
 }
 
}
