package javatraining.oletsky.overloads;

/**
 * @author O.Oletsky
 * An example of overloading
 * If one function accepts long and the other accepts int...
 * which of them would be called?
 *
 */
public class PromotionOrVarLengthOverload {
    public static void main(String[] args) {
        new VarOrPromotion().foo(1);
    }
}

class VarOrPromotion {
    void foo(int... v) {
        System.out.println("int ...");
    }

    void foo(long v) {
        System.out.println("long");
    }
}
