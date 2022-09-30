package com.bmcl.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest {

    @Test
public void accept(){

        PositiveFilter filter = new PositiveFilter();

        Assertions.assertEquals(true, filter.accept(1));
        Assertions.assertEquals(false,filter.accept(-1));

    }

}
