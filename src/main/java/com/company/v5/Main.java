package com.company.v5;

import com.company.v5.input.CommandLineInputs;
import com.company.v5.input.CommandLineInputs;
import com.company.v5.input.Inputs;
import com.company.v5.operation.Operation;
import com.company.v5.operation.OperationFactory;
import com.company.v5.repository.FileNumberRepository;
import com.company.v5.repository.NumberRepository;
import com.company.v5.ui.CmdLineUI;
import com.company.v5.ui.UI;

public class Main {
    //main class is the coordinator
    public static void main(String[] args){
        Inputs inputs = (Inputs) new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs, numberRepository, operationFactory, ui);
        app.execute();

    }
}