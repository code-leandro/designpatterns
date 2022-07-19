package usecase.factorymethod;

import domain.tax.CalculateTax;
import domain.tax.CalculateTaxMG;
import domain.tax.CalculateTaxSP;

public class TaxCreator {

     public CalculateTax create(String state) {

        if (state.equals("MG")) {
            return new CalculateTaxMG();
        }
        else if (state.equals("SP")) {
            return new CalculateTaxSP();
        }

        throw new RuntimeException("State invalid! There aren't any implementation for state " + state);
    }

}
