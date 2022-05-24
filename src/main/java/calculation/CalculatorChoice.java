package calculation;

import model.Blanket;
import model.Size;

public class CalculatorChoice {

    public int choice(Blanket blanket) {
        Size size = blanket.getSize();
         CalculatorStrategy priceCalculator = choice(size);
        int price = priceCalculator.getPrice(blanket);
        System.out.println("Price" + price);
        return price;
    }
    public CalculatorStrategy choice(Size size) {
        CalculatorStrategy priceCalculator;

        switch (size) {
            case SMALL:
                priceCalculator = new SmallBlanketCalculator();
                break;
            case MEDIUM:
                priceCalculator = new MediumBlanketCalculator();
                break;
            case LARGE:
                priceCalculator = new LargeBlanketCalculator();
                break;
            default:
                throw new IllegalStateException("Unknow size" + size);
        }
        return priceCalculator;
    }



}
