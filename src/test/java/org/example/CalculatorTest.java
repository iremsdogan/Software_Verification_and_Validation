//        B231202372 - İrem Sevdenur Doğan
//        SWE 202 Software Verification and Validation
//        Homework 1
//        https://github.com/iremsdogan/Software_Verification_and_Validation

package org.example;

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
