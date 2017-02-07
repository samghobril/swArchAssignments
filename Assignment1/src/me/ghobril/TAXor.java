package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TAXor extends TABool{
    boolean data;
    public TAXor() {

    }

    public TAXor(TABool a, TABool b) {
        data = a.data ^ b.data;
    }
}
