package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TAMoreThan extends TABool{
    boolean data;
    public TAMoreThan() {

    }

    public TAMoreThan(TAObject a, TAObject b) {
        if(a.compare(b) > 0) {
            data = true;
        }
        else {
            data = false;
        }
    }
}
