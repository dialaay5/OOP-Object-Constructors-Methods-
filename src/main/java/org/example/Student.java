package org.example;

public class Student {
    protected String name;
    protected int rollNum;
    protected String phoneNum;
    protected String address;

    public Student(String name, int rollNum, String phoneNum, String address) {
        this.name = name;
        this.rollNum = rollNum;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
