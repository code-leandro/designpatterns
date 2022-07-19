package usecase.strategy;

import usecase.domain.tax.CalculateTax;
import usecase.factorymethod.TaxCreator;

import java.math.BigDecimal;

public class Client {

    public static void main(String args[]) {

        String state = args[0];
        CalculateTax calculate = new TaxCreator().create(state);
        BigDecimal tax = calculate.execute();
        System.out.println("The tax is: " + tax);
    }
}
