package com.isa.geometry;

import org.junit.jupiter.api.*;

public class PointTest {

    @DisplayName("null user")
    @BeforeAll
    public static void a() {

    }

    @AfterAll
    public static void b() {

    }

    @BeforeEach
    public void c() {

    }

    @AfterEach
    public void d() {

    }



    @Test
    public void testIfPointCreated() {
        Point point = new Point(3.5, 6.8);
    }

    @Test
    public void testIfPointCreated2() {
        Point point = new Point(1.1, 2.2);
    }

    @Test
    public void testIfPointCreated3() {
        Point point = new Point(2.6, 5.0);
    }

    @Test
    public void testIfDistanceIsCorrect() {
        Point point = new Point(2.0, 5.0);
        Assertions.assertEquals(4.123105625617661, point.distance(new Point(6.0, 4.0)));
    }
}
