package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TADynamic extends TAObject {
    TAObject data;
    public int compare(TAObject b) {
        if(data.getClass() == b.getClass()) {
            return(data.compare(b));
        }

        else {
            return -999;
        }
    }
}
