package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
class TALessThan extends TABool {

    boolean data;
    public TALessThan() {

    }

    public TALessThan(TAObject a, TAObject b) {
        if(a.compare(b) < 0) {
            data = true;
        }
        else {
            data = false;
        }
    }
}