package domain.tax;

import java.math.BigDecimal;

public class CalculateTaxMG implements CalculateTax{

    @Override
    public BigDecimal execute() {
        System.out.println("Complex calculation tax in MG...");
        return BigDecimal.TEN;
    }
}
