package org.example;

public class MyMath {
    public static final double PI = 3.14;
    public static final double E = 2.7;


    public int setNegative(int x) {
        return -x;
    }

    public float setNegative(float x) {
        return -x;
    }

    public double setNegative(double x) {
        return -x;
    }

    public long setNegative(long x) {
        return -x;
    }
    //2

    //3
    public double fr(int num)
    {
        double t;
        double sqrtroot=num/2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(num/t))/2;
        }
        while((t-sqrtroot)!= 0);
        return sqrtroot;
    }
}

