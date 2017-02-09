package me.ghobril;

/**
 * Created by samghobril on 2/9/17.
 */
abstract public class TAPrimitive extends TAObject {
    abstract public int compare(TAPrimitive b);
    public TAPrimitive getData() {
        return this;
    }
}