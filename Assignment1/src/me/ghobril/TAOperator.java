package me.ghobril;

/**
 * Created by samghobril on 2/9/17.
 */
abstract public class TAOperator extends TAObject {
    TAObject first;
    TAObject second;
    TAPrimitive data;
    boolean twoOperands;

    public TAOperator(TAObject one, TAObject two) {
        first = one.getData();
        second = two.getData();
        twoOperands = true;
    }

    public TAOperator(TAObject one) {
        first = one.getData();
        twoOperands = false;
    }

    public TAOperator() {

    }

    public TAPrimitive getData() {
        return data;
    }
}