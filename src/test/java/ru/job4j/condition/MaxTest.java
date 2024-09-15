package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5to4Then5() {
        int left = 5;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax50to50Then50() {
        int left = 50;
        int right = 50;
        int result = Max.max(left, right);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax30to50Then50() {
        int left = 30;
        short right = 50;
        int result = Max.max(left, right);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax30to40Then40() {
        short left = 30;
        short right = 40;
        int result = Max.max(left, right);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax50to40And30Then50() {
        int left = 30;
        int right = 50;
        int middle = 40;
        int result = Max.max(left, right, middle);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax60to30And40And50Then60() {
        int a = 30;
        int b = 40;
        int c = 50;
        int d = 60;
        int result = Max.max(a, b, c, d);
        int expected = 60;
        assertThat(result).isEqualTo(expected);
    }
}