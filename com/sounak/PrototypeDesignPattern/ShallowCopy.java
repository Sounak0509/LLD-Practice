package com.sounak.PrototypeDesignPattern;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeeShallowCopy employeeShallowCopy1 = new EmployeeShallowCopy("Sounak", new AddressShallowCopy("Pune"));
        EmployeeShallowCopy employeeShallowCopy2 = (EmployeeShallowCopy) employeeShallowCopy1.clone();
        employeeShallowCopy2.name = "Rahul";
        employeeShallowCopy2.addressShallowCopy.city = "Mumbai";

        System.out.println(employeeShallowCopy1.addressShallowCopy.city); // Mumbai ← unintended!
        System.out.println(employeeShallowCopy2.addressShallowCopy.city);
    }
}


