package domain.tax;

import java.math.BigDecimal;

public class CalculateTaxSP implements CalculateTax {

    @Override
    public BigDecimal execute() {
        System.out.println("Complex calculation tax in SP...");
        return BigDecimal.ONE;
    }
}
