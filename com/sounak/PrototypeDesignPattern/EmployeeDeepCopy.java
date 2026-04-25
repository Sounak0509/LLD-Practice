package com.sounak.PrototypeDesignPattern;

public class EmployeeDeepCopy implements Cloneable {
    String name;
    AddressDeepCopy addressDeepCopy;

    EmployeeDeepCopy(String name, AddressDeepCopy addressDeepCopy) {
        this.name = name;
        this.addressDeepCopy = addressDeepCopy;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        EmployeeDeepCopy clone = (EmployeeDeepCopy) super.clone();
        clone.addressDeepCopy = (AddressDeepCopy) addressDeepCopy.clone();
        return clone;
    }
}
