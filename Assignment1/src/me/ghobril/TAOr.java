package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TAOr extends TAOperator {
    public TAOr(TAObject one, TAObject two) {
        super(one, two);
        operation = "|";
    }

    public void evaluate() {
        super.evaluate();
        TABool one = (TABool)first.getData();
        TABool two = (TABool)second.getData();
        boolean answer = one.data || two.data;
        TABool objectAnswer = new TABool();
        objectAnswer.set(answer);
        this.data = objectAnswer;
    }
}
