package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TANot extends TABool {
    boolean data;
    public TANot() {

    }

    public TANot(TABool a) {
        data = !a.data;
    }
}