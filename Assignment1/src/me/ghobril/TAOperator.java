package me.ghobril;

/**
 * Created by samghobril on 2/9/17.
 */
abstract public class TAOperator extends TAObject {
    TAObject first;
    TAObject second;
    TAPrimitive data;
    boolean twoOperands;
    String operation;

    public TAOperator(TAObject one, TAObject two) {
        first = one;
        second = two;
        twoOperands = true;
    }

    public TAOperator(TAObject one) {
        first = one;
        twoOperands = false;
    }

    public TAOperator() {

    }

    public void evaluate() {
        first.evaluate();
        if(twoOperands) {
            second.evaluate();
        }
    }

    public void list() {
        if(twoOperands) {
            System.out.print("(" + operation + " ");
            first.list();
            System.out.print(" ");
            second.list();
            System.out.print(" )");
        }

        else {
            System.out.print("(" + operation + " ");
            first.list();
            System.out.print(" )");
        }
    }

    public TAPrimitive getData() {
        return data;
    }

    public void printState() {
        data.getData().printState();
    }
}