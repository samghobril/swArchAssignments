package me.ghobril;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TAInt x = new TAInt("x");
        TADouble d = new TADouble("d");
        TACeiling y = new TACeiling(d); // denotes y is the ceiling of d
        TABool b = new TABool("b");
        TALessThan t1 = new TALessThan(x,y); // denotes x < y
        TAAnd t2 = new TAAnd(b, t1); // denotes b and t1
        t2.list();// should print: (& b (< x (ceiling d ) ) )
        x.set(5);
        d.set(2.3);
        b.set(true);
        t1.evaluate();
        t1.printState();// should print: false
        d.set(5.3);
        t1.evaluate();
        t1.printState();
    }
}
