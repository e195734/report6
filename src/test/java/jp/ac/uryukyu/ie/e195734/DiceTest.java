package jp.ac.uryukyu.ie.e195734;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void dice() {
        assertEquals(-1, Dice.dice("100"));
    }
}