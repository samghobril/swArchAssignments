package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TACeiling extends TAOperator {

    public TACeiling(TAObject object) {
        super(object);
        operation = "ceil";
    }

    public void evaluate() {
        super.evaluate();
        TADouble one = (TADouble) first.getData();
        int answer = (int)Math.ceil(one.data);
        TAInt objectAnswer = new TAInt();
        objectAnswer.set(answer);
        this.data = objectAnswer;
    }
}