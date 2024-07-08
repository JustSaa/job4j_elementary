package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CounterTest {

    @Test
    void whenStart0Finish5ThenSum15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int sum = 15;

        assertThat(sum).isEqualTo(result);
    }

    @Test
    void whenStart5Finish0ThenSum0() {
        int start = 5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int sum = 0;

        assertThat(sum).isEqualTo(result);
    }

    @Test
    void whenStart5Finish5ThenSum5() {
        int start = 5;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int sum = 5;

        assertThat(sum).isEqualTo(result);
    }

    @Test
    void whenStartMinus15FinishMinus10ThenSumMinus75() {
        int start = -15;
        int finish = -10;
        int result = Counter.sum(start, finish);
        int sum = -75;

        assertThat(sum).isEqualTo(result);
    }

    @Test
    void whenStartMinus5Finish10ThenSum9() {
        int start = -5;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int sum = 40;

        assertThat(sum).isEqualTo(result);
    }
}
