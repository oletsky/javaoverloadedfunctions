package javatraining.oletsky.overloads;

/**
 * @author O.Oletsky
 * A class has two overloaded functions. One of them accepts Object
 * and the other accepts String. The argument is string
 * but its type is Object.
 * Which function would be called?
 */

public class TypeOrClassOverLoad {
    public static void main(String[] args) {
        Object x = "qwerty";
        new TypeOrClassOverLoadClass().foo(x); //Object
    }
}

class TypeOrClassOverLoadClass {
    public void foo(String x) {
        System.out.println("String");
    }

    public void foo(Object x) {
        System.out.println("Object");
    }
}
