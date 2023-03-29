package calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator rechner;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        rechner = new Calculator();
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertTrue(rechner.add(10, 30) ==40);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        int resultat = rechner.subtract(30,10);
        assertTrue(rechner.subtract(30, 10) == 20);
    }
}