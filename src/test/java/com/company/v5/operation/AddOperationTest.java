package com.company.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AddOperationTest {

    //test case
    //positive + positive => correct answer => 5,6 =>11
    //zero + zero => correct answer => 0,0 => 0
    //negative + negative => correct answer => -1, -2 => -3
    //positive + negative => correct answer => -1, +2 => 1

    @Test
    public void should_add_positive_values() {

        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{5.0, 6.0});

        assertThat(result, is(11.0));

    }

    @Test
    public void should_add_zeros() {

        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{0.0, 0.0});

        assertThat(result, is(0.0));

    }

    @Test
    public void should_add_negative_values() {

        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{-1.0, -2.0});

        assertThat(result, is(-3.0));

    }


}