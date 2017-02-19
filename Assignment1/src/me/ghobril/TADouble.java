package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TADouble extends TAPrimitive {
    double data;
    public TADouble() {

    }

    public TADouble(String n) {
        super(n);
    }

    public int compare(TAPrimitive b) {
        if(b.getClass() == getClass()) {
            TADouble toCompare = (TADouble)b;
            return (int)(data-toCompare.data);
        }

        else {
            return -9999;
        }
    }

    public void set(double state) {
        data = state;
    }

    public void printState() {
        System.out.print(data);
    }


}
