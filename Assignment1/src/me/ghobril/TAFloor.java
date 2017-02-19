package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TAFloor extends TAOperator {
    public TAFloor(TAObject one) {
        super(one);
        operation = "floor";
    }

    public void evaluate() {
        super.evaluate();
        TADouble one = (TADouble) first.getData();
        int answer = (int)Math.floor(one.data);
        TAInt objectAnswer = new TAInt();
        objectAnswer.set(answer);
        this.data = objectAnswer;
    }
}
