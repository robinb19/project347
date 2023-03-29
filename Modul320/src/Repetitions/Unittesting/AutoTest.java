package Repetitions.Unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    Auto auto = new Auto();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.auto = auto;
    }

    @org.junit.jupiter.api.Test
    void getTankinhalt() {
        assertEquals(0, auto.getTankinhalt(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void tanken() {
        auto.tanken(50);
        assertEquals(50, auto.getTankinhalt(), 0.01);
        auto.tanken(0.01);
        assertEquals(50, auto.getTankinhalt(), 0.001);
    }

    @org.junit.jupiter.api.Test
    void fahren() {
        auto.fahren(0.01);
        assertEquals(0, auto.getTankinhalt(), 0.001);
        auto.tanken(50);
        auto.fahren(1000);
        assertEquals(0, auto.getTankinhalt(), 0.01);
        auto.fahren(0.01);
        assertEquals(0,auto.getTankinhalt(), 0.001);
    }
}