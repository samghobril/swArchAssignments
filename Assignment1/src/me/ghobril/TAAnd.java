package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TAAnd extends TAOperator {
    public TAAnd(TAObject one, TAObject two) {
        super(one, two);
        operation = "&";
    }

    public void evaluate() {
        super.evaluate();
        TABool one = (TABool)first;
        TABool two = (TABool)second;
        boolean answer = one.data && two.data;
        TABool objectAnswer = new TABool();
        objectAnswer.set(answer);
        this.data = objectAnswer;
    }
}