package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K10Square2dot06() {
        double expected = 2.06;
        int p = 10;
        double k = 10;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP60K2Square200() {
        int expected = 200;
        int p = 60;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP50K10Square51dot65() {
        double expected = 51.65;
        int p = 50;
        double k = 10;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}