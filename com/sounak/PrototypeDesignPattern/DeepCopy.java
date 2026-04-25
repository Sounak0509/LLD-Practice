package com.sounak.PrototypeDesignPattern;

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeeDeepCopy emp1 = new EmployeeDeepCopy("Sounak", new AddressDeepCopy("Pune"));
        EmployeeDeepCopy emp2 = (EmployeeDeepCopy) emp1.clone();

        emp2.name = "Rahul";
        emp2.addressDeepCopy.city = "Mumbai";  // ✅ only affects emp2 now

        System.out.println(emp1.addressDeepCopy.city); // Pune ✅
        System.out.println(emp2.addressDeepCopy.city); // Mumbai ✅

    }
}
