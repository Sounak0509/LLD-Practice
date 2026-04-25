package com.sounak.PrototypeDesignPattern;

public class AddressDeepCopy implements Cloneable {
    String city;

    AddressDeepCopy(String city) {
        this.city = city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
