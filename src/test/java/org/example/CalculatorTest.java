//        B231202372 - İrem Sevdenur Doğan
//        SWE 202 Software Verification and Validation
//        Homework 1
//        https://github.com/iremsdogan/Software_Verification_and_Validation.git

package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//I imported the components that allow writing parameterized tests in the JUnit 5 library.
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorParameterizedTest {    // I created the CalculatorParameterizedTest class
    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 2.5, 5",
            "10, 2.5, 4",
            "12.5, 5, 2.5",
    })
    void testDivision(float dividend, float divisor, float expected) {
        float result = Calculator.divide(dividend, divisor);
        assertEquals(expected, result);
    }
}

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDivision1() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void testDivision2() {
        assertEquals(2.5, Calculator.divide(10, 4));
    }

    @Test
    void testDivision3() {
        assertEquals(5, Calculator.divide(12.5f, 2.5f));
    }

    @Test
    void testDivision4() {
        assertEquals(4, Calculator.divide(10, 2.5f));
    }

    @Test
    void testDivision5() {
        assertEquals(2.5f, Calculator.divide(12.5f, 5));
    }

    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );

        // Optional. To check whether the error messages match.
        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }
}