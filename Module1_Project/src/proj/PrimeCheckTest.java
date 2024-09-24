package proj;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeCheckTest {

    @Test
    public void testPrimeNumber() {
        assertTrue(PrimeCheck.isPrime(2));
        assertTrue(PrimeCheck.isPrime(3));
    }

    @Test
    public void testNonPrimeNumber() {
        assertFalse(PrimeCheck.isPrime(4));
        assertFalse(PrimeCheck.isPrime(6));
    }

    @Test
    public void testEdgeCases() {
        assertFalse(PrimeCheck.isPrime(0));
        assertFalse(PrimeCheck.isPrime(1));
    }

    @Test
    public void testLargePrimeNumber() {
        assertTrue(PrimeCheck.isPrime(29));
    }

    @Test
    public void testLargeNonPrimeNumber() {
        assertFalse(PrimeCheck.isPrime(100));
    }

    @Test
    public void testNegativeNumbers() {
        assertFalse(PrimeCheck.isPrime(-5));
        assertFalse(PrimeCheck.isPrime(-10));
    }
}
