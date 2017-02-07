package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TAOr {
    boolean data;
    public TAOr() {

    }

    public TAOr(TABool a, TABool b) {
        data = a.data || b.data;
    }
}
