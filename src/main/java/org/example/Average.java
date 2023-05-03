package org.example;

public class Average {
    private static int _a;
    private static int _b;
    private static int _c;

    public static int getA() {
        return _a;
    }
    public static int getB() {
        return _b;
    }
    public static int getC() {
        return _c;
    }
    public static void setA(int a) {
        _a = a;
    }
    public static void setB(int b) {
        _b = b;
    }
    public static void setC(int c) {
        _c = c;
    }

    public static void calculate(){
        System.out.printf("the average= %d" , ((_a+_b+_c) / 3) );
    }

}

