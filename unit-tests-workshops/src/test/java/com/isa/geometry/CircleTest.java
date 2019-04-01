package com.isa.geometry;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testIfCircumferenceCalculatedProperlyForValidInput() {
        Circle circle = new Circle(2.0);

        Assertions.assertThat(circle.calculateCircumference())
                .isNotNaN()
                .isEqualTo(12.566370614359172);
    }

    @Test
    public void testIfCircumferenceCalculatedProperlyForInvalidInput() {
        Circle circle = new Circle();

        Assertions.assertThatThrownBy(() -> circle.calculateCircumference())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Radius is mandatory!");
    }
}
