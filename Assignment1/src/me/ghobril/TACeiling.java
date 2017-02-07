package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TACeiling extends TAInt {
    public TACeiling() {

    }

    public TACeiling(double x) {
        data = (int)Math.ceil(x);
    }
}
