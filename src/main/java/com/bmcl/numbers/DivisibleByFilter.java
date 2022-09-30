package com.bmcl.numbers;

public class DivisibleByFilter implements GenericListFilter{

    private int divider;

DivisibleByFilter(Integer d){
    this.divider=d;
}


@Override
    public boolean accept (Integer a){

    if (a%divider==0) return true;
    else return false;


}
}
