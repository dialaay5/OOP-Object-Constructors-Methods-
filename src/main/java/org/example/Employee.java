package org.example;

public class Employee {
    protected String name;
    protected int year;
    protected String address;
    protected int salary;

    public Employee(String name, int year, String address, int salary) {
        this.name = name;
        this.year = year;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                name + "   "+
                        year + "   "+
                        address + "   "+
                        salary
                ;
    }
}
