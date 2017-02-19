package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TANot extends TAOperator {
    public TANot(TAObject one) {
        super(one);
        operation = "!";
    }

    public void evaluate() {
        super.evaluate();
        TABool one = (TABool)first.getData();
        boolean answer = !one.data;
        TABool objectAnswer = new TABool();
        objectAnswer.set(answer);
        this.data = objectAnswer;
    }
}