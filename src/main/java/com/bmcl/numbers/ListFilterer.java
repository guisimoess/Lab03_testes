package com.bmcl.numbers;

import com.bmcl.numbers.GenericListFilter;
import com.bmcl.numbers.GenericListSorter;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {

    private final GenericListFilter filter;

    // Construtor
    ListFilterer (GenericListFilter filter) {
this.filter = filter;


    }

    public List<Integer> filter (List<Integer> list){
List<Integer> filtered = new ArrayList<>();
for (int i: list)
    if (filter.accept(i)) filtered.add(i);
return filtered;

    }
}
