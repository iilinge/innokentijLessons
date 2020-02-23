package tasks.lesson1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void primeNumbersTest2() {
        assertEquals("2", Task1.primeNumbers(2));
    }

    @Test
    public void primeNumbersTest10() {
        assertEquals("2,3,5,7", Task1.primeNumbers(10));
    }

    @Test
    public void primeNumbersTest100() {
        assertEquals("2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97", Task1.primeNumbers(100));
    }

    @Test
    public void primeNumbersTest1() {
        assertEquals("", Task1.primeNumbers(1));
    }
}