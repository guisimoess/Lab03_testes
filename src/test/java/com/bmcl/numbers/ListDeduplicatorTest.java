package com.bmcl.numbers;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sun.jvm.hotspot.code.Stub;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    @Test
    public void deduplicate() {


        GenericListSorter sorter = Mockito.mock(GenericListSorter.class);
        Mockito.when(sorter.sort(Mockito.anyList())).thenReturn(Arrays.asList(1,2,2,4,5));


        List<Integer> list = Arrays.asList(1, 2, 4, 2, 5);
        List<Integer> expected = Arrays.asList(1, 2, 4, 5);

        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }

    @Test
    public void deduplicateBug() {

        GenericListSorter sorter = Mockito.mock(GenericListSorter.class);
        Mockito.when(sorter.sort(Mockito.anyList())).thenReturn(Arrays.asList(1,2,2,4));


        List<Integer> list = Arrays.asList(1, 2, 4, 2);
        List<Integer> expected = Arrays.asList(1, 2, 4);

        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);





    }
}





