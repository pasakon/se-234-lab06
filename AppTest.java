import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

public class AppTest {
    private App appObj;
    
    @Before
    public void setup(){
        appObj = new App();
    }
    @Test 
    public void testSmallPrime(){
        assertEquals(true, appObj.isPrime(17));

    }
    @Test 
    public void testSmallNotPrime(){
        assertEquals(false, appObj.isPrime(33));
        
    }
    @Test 
    public void testSLargePrime(){
        assertEquals(true, appObj.isPrime(32416189049L));
        
    }
    @Test 
    public void testSLargeNotPrime(){
        assertEquals(false, appObj.isPrime(32416189051L));
        
    }
    
}

