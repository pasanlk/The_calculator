package com.company.v5;

import com.company.v5.input.Inputs;
import com.company.v5.input.InvalidInputException;
import com.company.v5.operation.InvalidCalOperationException;
import com.company.v5.operation.Operation;
import com.company.v5.operation.OperationFactory;
import com.company.v5.repository.NumberRepository;
import com.company.v5.repository.NumberRepositoryException;
import com.company.v5.ui.UI;

public class CalculatorApp {

    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute(){
        try{
            String operator = inputs.getOperator();
            Double[] numbers =  numberRepository.getNumbers();
            Operation operation = operationFactory.getInstance(operator);
            Double result = operation.execute(numbers);
            ui.showMessage("The result is " + result);
        } catch (InvalidInputException | NumberRepositoryException e) {
            ui.showMessage("Error Occurred! " + e.getMessage());
            return;
        }
    }

}