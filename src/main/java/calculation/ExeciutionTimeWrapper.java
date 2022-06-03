package calculation;

import model.Blanket;

import java.time.Instant;

public class ExeciutionTimeWrapper implements CalculatorStrategy{
    private final CalculatorStrategy decorated;

    public ExeciutionTimeWrapper(CalculatorStrategy calculator) {
        this.decorated = calculator;
    }

    @Override
    public int getPrice(Blanket blanket) {
        int before = Instant.now().getNano();
        int price = decorated.getPrice(blanket);
        int after = Instant.now().getNano();

        System.out.println("Calculation time" + (after - before));
        return price;
    }
}
