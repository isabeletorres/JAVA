package util;

public class Calculator {
    public static final double PI = 3.14159;

    public static double circumference(double radios){
        return 2.0 *PI *radios;
    }
    public static double volume(double radios){
        return 4.0 * PI* (Math.pow(radios, 3))/3;
    }
}
