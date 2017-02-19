package me.ghobril;

/**
 * Created by samghobril on 2/9/17.
 */
abstract public class TAPrimitive extends TAObject {
    abstract public int compare(TAPrimitive b);
    String name;
    public TAPrimitive getData() {
        return this;
    }

    public void list() {
        System.out.print(name);
    }

    public TAPrimitive(String n) {
        name = n;
    }

    public TAPrimitive() {

    }

    public void evaluate() {

    };

    abstract public void printState();
}