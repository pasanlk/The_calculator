package com.company.v5.operation;

public class OperationFactory {

    public Operation getInstance(String operator) {

        Operation operation = null;

        if (operator.equals("add")) {
            operation = (Operation) new AddOperation();

        } else if (operator.equals("sub")) {
            operation = (Operation) new SubOperation();

        } else if (operator.equals("mul")) {
            operation = (Operation) new MulOperation();
        } else if (operator.equals("div")) {
            operation = new DivOperation(); //OCP violated but this is a known violation

        }

        return operation;
    }

}