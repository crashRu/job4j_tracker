package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiapasonFuncTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        DiapasonFunc function = new DiapasonFunc();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        DiapasonFunc function = new DiapasonFunc();
        List<Double> result = function.diapason(5, 8, x -> 2 * x * x + 1);
        List<Double> expected = Arrays.asList(51D, 73D, 99D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenDemonstrationFunctionThenDemonstrationResults() {
        DiapasonFunc function = new DiapasonFunc();
        List<Double> result = function.diapason(5, 8, x -> 2 * Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(65D, 129D, 257D);
        assertThat(result, is(expected));
    }

}