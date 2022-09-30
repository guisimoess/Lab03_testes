package com.bmcl.numbers;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.code.Stub;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    @Test
    public void deduplicate() {
        class StubListSorter implements GenericListSorter {
            @Override
            public List<Integer> sort(List<Integer> list) {
                return Arrays.asList(1, 2, 4, 5);
            }
        }


        StubListSorter sorter = new StubListSorter();
        List<Integer> list = Arrays.asList(1, 2, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 4, 5);

        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }

    @Test
    public void deduplicateBug() {
        class StubListSorter implements GenericListSorter {
            @Override
            public List<Integer> sort(List<Integer> list) {
                return Arrays.asList(1, 2, 2, 4);
            }
        }


        StubListSorter sorter = new StubListSorter();
        List<Integer> list = Arrays.asList(1, 2, 4, 2);
        List<Integer> expected = Arrays.asList(1, 2, 4);

        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(list);


        Assertions.assertEquals(expected, distinct);


    }
}





