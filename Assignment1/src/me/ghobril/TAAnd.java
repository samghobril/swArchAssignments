package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TAAnd extends TABool {
    boolean data;
    public TAAnd() {

    }

    public TAAnd(TABool a, TABool b) {
        data = a.data && b.data;
    }
}
