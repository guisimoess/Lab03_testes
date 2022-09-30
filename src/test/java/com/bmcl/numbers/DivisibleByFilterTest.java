package com.bmcl.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {


    @Test
    void acceptDivideby3()

    {
        DivisibleByFilter filter = new DivisibleByFilter(3);

        List<Integer> divisible = Arrays.asList(0, 3, 6, 9, 12, 300, 312, 1002, 9987);
        List<Integer> nondivisible = Arrays.asList(2, 4, 7, 10, 100, 556, 1232, 10000);

        for (int n : divisible)
            Assertions.assertTrue(filter.accept(n));

        for (int n: nondivisible)
            Assertions.assertFalse(filter.accept(n));

    }
}
