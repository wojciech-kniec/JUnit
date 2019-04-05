package com.isa.operator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.prefs.BackingStoreException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicIntOperatorTest {
    BasicIntOperator basicIntOperator;

    @Test
    @BeforeEach
    public void setupTest() {
        basicIntOperator = new BasicIntOperator(4, 2);
    }

    @AfterEach
    public void cleanAfterTest() {
        basicIntOperator = null;
    }

    public void testSum() {

        assertEquals(6, basicIntOperator.sum());
    }

    @Test
    public void testDifference() {

        assertEquals(2, basicIntOperator.difference());
    }

    @Test
    public void testProduct() {

        assertEquals(8, basicIntOperator.product());
    }

    @Test
    public void testQuotient() {

        assertEquals(2, basicIntOperator.quotient());
    }
}
