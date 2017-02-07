package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TAInt extends TAObject{
    int data;
    public TAInt() {

    }

    public int compare(TAObject b) {
        if(b.getClass() == getClass()) {
            TAInt toCompare = (TAInt)b;
            return data-toCompare.data;
        }

        else {
            return -9999;
        }
    }
}
