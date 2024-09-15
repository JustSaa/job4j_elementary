package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to20then2dot23() {
        double expected = 2.23;
        Point a = new Point(0, 1);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to23then3dot16() {
        double expected = 3.16;
        Point a = new Point(1, 0);
        Point b = new Point(2, 3);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22to28then6() {
        double expected = 6;
        Point a = new Point(2, 2);
        Point b = new Point(2, 8);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when99to99then0() {
        double expected = 0;
        Point a = new Point(9, 9);
        Point b = new Point(9, 9);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}