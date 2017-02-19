package me.ghobril;

/**
 * Created by samghobril on 2/7/17.
 */
class TALessThan extends TAOperator {
    public TALessThan(TAObject one, TAObject two) {
        super(one, two);
        operation = "<";
    }

    public void evaluate() {
        super.evaluate();
        if(first.getData().getClass() == TADouble.class) {
            TADouble one = (TADouble)first.getData();
            TADouble two = (TADouble)second.getData();
            boolean answer = one.data < two.data;
            TABool objectAnswer = new TABool();
            objectAnswer.set(answer);
            this.data = objectAnswer;
        }

        else if(first.getData().getClass() == TAInt.class) {
            TAInt one = (TAInt)first.getData();
            TAInt two = (TAInt)second.getData();
            boolean answer = one.data < two.data;
            TABool objectAnswer = new TABool();
            objectAnswer.set(answer);
            this.data = objectAnswer;
        }
    }
}