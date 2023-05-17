package org.example;

public class NumberHolder {
    public int intNumber;
    public float floatNumber;

    public NumberHolder() {
    }

    public NumberHolder(int intNumber) {
        this.intNumber = intNumber;
        this.floatNumber = 25f;
    }

    @Override
    public String toString() {
        return "NumberHHolder{" +
                "intNumber=" + intNumber +
                ", floatNumber=" + floatNumber +
                '}';
    }
}
