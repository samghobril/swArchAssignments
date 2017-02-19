package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
public class TAMultiply extends TAOperator {
    public TAMultiply(TAObject one, TAObject two) {
        super(one, two);
        operation = "*";
    }

    public void evaluate() {
        super.evaluate();
        if(first.getData().getClass() == TADouble.class) {
            TADouble one = (TADouble)first.getData();
            TADouble two = (TADouble)second.getData();
            double answer = one.data * two.data;
            TADouble objectAnswer = new TADouble();
            objectAnswer.set(answer);
            this.data = objectAnswer;
        }

        else if(first.getData().getClass() == TAInt.class) {
            TAInt one = (TAInt)first.getData();
            TAInt two = (TAInt)second.getData();
            int answer = one.data * two.data;
            TAInt objectAnswer = new TAInt();
            objectAnswer.set(answer);
            this.data = objectAnswer;
        }
    }
}
