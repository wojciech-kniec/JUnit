package com.isa.geometry;

import org.assertj.core.api.AbstractDoubleAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
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

    @Test
    @DisplayName("Check if area is calculated propertly when correct iput is provided.")
    public void testIfEqualIsNumber() {
        Circle circle = new Circle(3.0);

        Assertions.assertThat(circle.calculateArea())
                .isNotNaN()
                .isPositive()
                .isCloseTo(28.2743, Offset.offset(0.0001));
    }
}