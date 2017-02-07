package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TADouble extends TAObject {
    double data;
    public TADouble() {

    }

    public int compare(TAObject b) {
        if(b.getClass() == getClass()) {
            TADouble toCompare = (TADouble)b;
            return (int)(data-toCompare.data);
        }

        else {
            return -9999;
        }
    }
}
