package javatraining.oletsky.overloads;

/**
 * @author O.Oletsky
 * A class has two overloaded functions. One of them accepts byte
 * and the other accepts int. An argument is 5.
 * Which function would be called?
 */
public class ImplicitIntOverLoad {
    public static void main(String[] args) {
        new ImplicitIntOverLoadClass().foo(5);
    }

}

class ImplicitIntOverLoadClass {
    public void foo(byte x) {
        System.out.println("byte");
    }

    public void foo(int x) {
        System.out.println("int");
    }
}
