package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TABool extends TAPrimitive {
    boolean data;

    public TABool() {

    }

    public TABool(String n) {
        super(n);
    }

    public int compare(TAPrimitive b) {
        return -999;
    }

    public void set(boolean state) {
        data = state;
    }

    public void printState() {
        System.out.print(data);
    }
}
