package com.sounak.PrototypeDesignPattern;

public class EmployeeShallowCopy implements Cloneable {
    String name;
    AddressShallowCopy addressShallowCopy;

    EmployeeShallowCopy(String name, AddressShallowCopy addressShallowCopy) {
        this.name = name;
        this.addressShallowCopy = addressShallowCopy;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
